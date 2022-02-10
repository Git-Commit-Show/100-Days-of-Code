def checkSubStr(s,sub):
    return sub.lower() in s.lower()

a= input('Enter String : ')
b= input('Enter Sub-string : ')

if checkSubStr(a,b):
    print(b,'is present in',a)
else:
    print(b,'is not present in',a)
