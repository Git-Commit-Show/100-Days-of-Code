# Python3 code to demonstrate working of
# Flatten Tuples List to String
# using join() + list comprehension
  
# initialize list of tuple
test_list = [('1', '4', '6'), ('5', '8'), ('2', '9'), ('1', '10')]
  
# printing original tuples list
print("The original list : " + str(test_list))
  
# Flatten Tuples List to String
# using join() + list comprehension
res = ' '.join([idx for tup in test_list for idx in tup])
  
# printing result
print("Tuple list converted to String is : " + res)