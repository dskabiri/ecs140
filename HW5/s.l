;/////////////////////////////////////////////////////
; BEGIN DEFINE HELPER FUNCTIONS:
;/////////////////////////////////////////////////////

(defun memberif (fun l)
	(cond
		((null l) nil)
		((not (listp l)) nil)
		((funcall fun (car l)) l)
		(t (memberif fun (cdr l)))
	)
)


(defun remov (l1 l2)
	(cond
		((null l2) nil)
		((not (listp l2)) nil)
		(t
			(if (eq l1 (car l2))
				(remov l1 (cdr l2))
				(append (list (car l2)) (remov l1 (cdr l2)))				
			)
		)
	)
)

(defun removeif (fun l)
	(cond
		((null l) nil)
		((not (listp l)) nil)
		(t 
			(if (funcall fun (car l))
				(removeif fun (cdr l))
				(append (list (car l)) (removeif fun (cdr l)))
			)				
		)
	)
)

(defun removeifnot (fun l)
	(cond
		((null l) nil)
		((not (listp l)) nil)
		(t 
			(if (funcall fun (car l))
				(append (list (car l)) (removeifnot fun (cdr l)))
				(removeifnot fun (cdr l))
			)				
		)
	)
)

(defun contains-alpha (l)
	(cond
		((null l) nil)
		((listp l) 
			(if (contains-alpha (car l))
				t
				(contains-alpha (cdr l))
			)
		)
		((or (equal '* l)
			(equal '+ l)		
			(numberp l))
			nil
		)		
		(t t)
	)
)

(defun collec (fun l)
	(cond
		((null l) nil)
		((not (listp l)) nil)		
		((listp l) 
			(if (funcall fun (car l))
				(append (list (car l)) (collec fun (cdr l)))
			(collec fun (cdr l))
			)
		)
	)
)

(defun mapca (fun l)
	(cond
		((null l) nil)
		((not (listp l)) nil)
		(t (append (list (funcall fun (car l))) (mapca fun (cdr l))))	
	)
)

;/////////////////////////////////////////////////////
; END DEFINE HELPER FUNCTIONS.
;/////////////////////////////////////////////////////

(defun surround-recursive (x y z)
	(cond	((null y) nil)
		((not (listp y)) nil)
		(t (cons (append (list x (car y)) (list z))
			(surround-recursive x (cdr y) z)))
	)
)
			

(defun surround-iterative (x y z)
	(cond ((null y) nil)
		((not (listp y)) nil)
		(t (do ((n 0 (1+ n))
			(l () (cons (append (list x (nth n y)) (list z)) l)))
			((>= n (length y)) (reverse l))
			)
   	)
	)
)


(defun surround-mapcar (x y z)
	(cond ((null y) nil)
		((not (listp y)) nil)
		(t (append (mapcar (lambda (a) 
			(append (list x a) (list z))) y) ())
		)
	)
)


(defun max-min (l)
	(cond 
		((not (listp l)) nil)
		
		((null l) 
			(list '-9999 '9999)
		)
		
		((not (memberif #'listp l)) 
			(if (not (null (removeifnot #'numberp l)))
				(list (apply #'max (removeifnot #'numberp l)) 
											(apply #'min (removeifnot #'numberp l))
				)				
				(list '-9999 9999)
			)
		)
		
		(t 
			(max-min
				(remov (car (memberif #'listp l)) 
					(append (car (memberif #'listp l)) l)
				)
			)
		)
	)
)


(defun simplify (x)
	(cond 
		((null x) nil)
			
		((not (listp x)) 		
			x
		)
		
		((not (contains-alpha x))
			(eval x)
		)			
		
		; if multipy by zero:
		((and (member '0 x) (member '* x))
			'0
		)
		
		((eq (length x) 2)
			(cadr x)
		)		
		
		((and (eq (length x) 3)
			(numberp (cadr x)))
			(if (eq '* (car x))
				(if (eq '1 (cadr x))
					(caddr x)
					x
				)	
				(if (eq '+ (car x))
					(if (eq '0 (cadr x))
						(caddr x)
						x
					)					
				)
			)
		)			
		
		((and (not (memberif #'numberp (cddr x)))
			(not (memberif #'listp x))
			)
			x
		)	
		
		; if no lists within a list:	
		((not (memberif #'listp x))
			; if all letters: 
			(if (null (removeifnot #'numberp (cdr x)))
				x
				; if all numbers:
				(if (null (removeif #'numberp (cdr x)))
					(eval x)
					; else numbers and letters:
					(simplify
						(append (list (car x)) 
										(append 
											(list (simplify (append (list (car x))
															(removeifnot #'numberp x)))
											) 
											(removeif #'numberp (cdr x))
										)
						)
					)
				)				
			)
		)
		
		; otherwise list(s) within a list exists:
		((memberif #'listp x)
			; if there are free numbers:
			(if (> (length (collec #'numberp x)) '1)
				(simplify
					(append (list (car x)) 
						(collec #'symbolp (cdr x))					
						(list 
							(eval (append (list (car x)) (collec #'numberp x)))
						)
						(collec #'listp x)
					)
				)
				; else start handling list(s) within list:
				; if simplifying produces a number, re-simplify:
				(if (memberif #'numberp
					(mapca #'simplify (collec #'listp x)))
					(simplify (append (removeif #'listp x)
						(mapca #'simplify (collec #'listp x)))
					)
					; else done
					(append (removeif #'listp x)
						(mapca #'simplify (collec #'listp x))
					)					
				)		
			)
		)
	)
)


(defun check (x)
	(list (eq 
		(eval (list 'let '((a 2) (b 3) (c 4) (d 5) (e 6) (f 7))
		x))			
		(eval (list 'let '((a 2) (b 3) (c 4) (d 5) (e 6) (f 7))
		(simplify x))))
		(eval (list 'let '((a 2) (b 3) (c 4) (d 5) (e 6) (f 7))
		x))			
		(eval (list 'let '((a 2) (b 3) (c 4) (d 5) (e 6) (f 7))
		(simplify x)))				  
	 )
)












