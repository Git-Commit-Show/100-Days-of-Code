# To create 5 different list using list comprehension method
# Made by Nouman

# Making a list of elements from 1 to 10
list1=[i for i in range(1,10)]
print("list1: ",list1)

# Making a list of square of all elements between 1 to 10
list2=[i*i for i in range(1,10)]
print("list2: ",list2)

# Making a list of all even elements in list1
list3=[i for i in list1 if(i%2==0)]
print("list3: ",list3)

# Making a list of all common elements in list1 and list3
list4=[i for i in list2 if(i in (list1 and list3))]
print("list4: ",list4)

# Dividing all the elements in list1 by 2
list5=[i/2 for i in list1]
print("list5: ",list5)