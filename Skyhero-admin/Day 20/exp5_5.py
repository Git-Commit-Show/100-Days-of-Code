def sortAlpha(string):
    l= string.split()
    l.sort()
    return " ".join(l)

n=input('Enter String : ')
print('Sorted String :',sortAlpha(n))
