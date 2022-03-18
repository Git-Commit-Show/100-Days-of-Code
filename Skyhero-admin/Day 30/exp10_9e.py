# Python3 code to demonstrate working of
# Add dictionary to tuple
# using append() + tuple() + list comprehension
 
# initialize tuple
test_tup = (4, 5, 6)
 
# printing original tuple
print("The original tuple : " + str(test_tup))
 
# initialize dictionary
test_dict = {"gfg" : 1, "is" : 2, "best" : 3}
 
# Add dictionary to tuple
# using append() + tuple() + list comprehension
test_tup = list(test_tup)
test_tup.append(test_dict)
test_tup = tuple(test_tup)
 
# printing result
print("Tuple after addition of dictionary : " + str(test_tup))