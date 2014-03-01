 @ a, b  #declared a and b 

 { a = 10 ` a < 20 ` a = a + 1  #starting a for loop 
 	{ b = 11 ` b < 21 ` b = b + 1  #starting a nested for loop is nested inside
 		!b }  #printing out b 
 !a # printing out a 
}
