n=input('Enter a sentence: ')

print('\n1.upper()             :',n.upper())
print('2.lower()             :',n.lower())
print('3.capitalize()        :',n.capitalize())
print('4.casefold()          :',n.casefold())
print('5.count() Count of "o":',n.count('o'))
print('6.find() Index of "o" :',n.find('o'))

l = n.split()
print('7.split()             :',l)
print('8.join()              :'," ".join(l))
print('9.endswith()          :',n.endswith("string"))
print('10.replace()          :',n.replace('hero','zero'))
