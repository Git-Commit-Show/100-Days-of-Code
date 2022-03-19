# Python3 code to demonstrate working of 
# Convert List of Lists to Tuple of Tuples
# Using tuple + list comprehension
  
# initializing list
test_list = [['Gfg', 'is', 'Best'], ['Gfg', 'is', 'love'],
                            ['Gfg', 'is', 'for', 'Geeks']]
  
# printing original list
print("The original list is : " + str(test_list))
  
# Convert List of Lists to Tuple of Tuples
# Using tuple + list comprehension
res = tuple(tuple(sub) for sub in test_list)
  
# printing result 
print("The converted data : " + str(res))