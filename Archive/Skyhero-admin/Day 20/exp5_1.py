def findDuplicate(string):
    list =[]
    for i in string:
        if i not in list and string.count(i) > 1:
            list.append(i)
    return list

n=input('Enter String : ')
print('Duplicate characters :',findDuplicate(n))
