c_numbers(N) :-
	course(N,_,_).

c_pl(N) :-
	course(N, programming_languages, _).

c_notpl(N) :-
	course(M, T, _),
	T \= programming_languages,
	N is M.

c_prereq142(N) :-
	course(M, _, L),
	M = 142,
	N = L.

c_upper(N) :-
	course(M, _, _),
	M > 99,
	N is M.

c_0prereq(N) :-
	course(M, _, []),
	N = M.

c_1prereq(N) :-
	course(N, _, [_L]).

c_upper_1prereq(N) :-
	course(M, _, [_L]),
	M > 99,
	N is M.

c_2prereqs_2upper(N) :-
	course(M, _, [A,B]),
	A > 99,
	B > 99,
	N is M.

c_2prereqs_1upper_or(N) :-
	course(M, _, [A,B]),
	(	A > 99, N = M
	;	B > 99, N = M
	).

c_2prereqs_1upper_wo(N) :-
	course(M, _, [A,_B]),
	A > 99,
	N is M.

c_2prereqs_1upper_wo(N) :-
	course(M, _, [_A,B]),
	B > 100,
	N = M.



sortappend(A, B, Z) :-
	append(A, B, C),
	sort(C, Z).
	
maxlist([H], H).
maxlist([H|T], Z) :-
	maxlist(T, A),
	(H >= A, Z = H;
	H < A, Z = A).
	
	
	
surround([], []).
surround([A], Z) :-
	Z = [[a, A, b]].
surround([H|T], Z) :-
	surround(T, Z1),
	Z1 \= [],
	Z2 = [a, H, b],
	append([Z2], Z1, Z).
	
play([], []).	
play(X, [H|T]) :-	
	member(B, X),
	H = [a, B, b],
	delete(X, B, A),
	play(A, T).
	
	
	
combination(0, _, []) :- 
    !.
combination(N, L, [V|R]) :-
    N > 0,
    NN is N - 1,
    unknown(V, L, Rem),
    combination(NN, Rem, R).

unknown(X,[X|L],L).
unknown(X,[_|L],R) :- 
    unknown(X,L,R).
	
assign(_, [], []).
assign([], _, []).
assign([[Car, 1]], [[Driver, y, Pref]], Z) :-
	Z = [[Car, [Driver, y, Pref], []]].
assign([[Car, Seats]|Rest], Drivers, Z) :-	
	length(Drivers, N),
	(N =:= Seats -> (combination(N, Drivers, C),
		permutation(C, [H|T]),
		(member(y, H) -> A = [[Car, H, T]]), 
		assign(Rest, Drivers, B));
		(N > Seats -> (combination(Seats, Drivers, C),
			permutation(C, [H|T]),
			(member(y, H) -> A = [[Car, H, T]]),
			remove(C, Driver, D),
			assign(Rest, D, B));
			assign(Rest, Drivers, A)
		)
	),
	append(A, B, Z).
	
		

	



	









	
