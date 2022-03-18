# Python3 code to demonstrate working of
# Removing duplicates from tuple 
# using tuple() + set()
  
# initialize tuple
test_tup = (1, 3, 5, 2, 3, 5, 1, 1, 3)
  
# printing original tuple 
print("The original tuple is : " + str(test_tup))
  
# Removing duplicates from tuple 
# using tuple() + set()
res = tuple(set(test_tup))
  
# printing result
print("The tuple after removing duplicates : " + str(res))