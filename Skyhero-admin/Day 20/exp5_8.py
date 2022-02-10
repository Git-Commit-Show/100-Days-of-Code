def checkAnagram(a,b):
    case=False
    if(len(s1)==len(s2)):
        for i in s1.lower():
            if i in s2.lower():
                case=True
            else:
                case=False
                break
    return case

s1=input("Enter word 1: ")
s2=input("Enter word 2: ")

if checkAnagram(s1, s2):
    print(s1,"and",s2,"are anagrams")
else:
    print(s1,"and",s2,"are not anagrams")
