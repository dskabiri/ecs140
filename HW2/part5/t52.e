 @x #declaring x 
  { x = 0 ` x < 0 ` x = x + 1 #should loop 0 times because of x < 0 
   !x }  