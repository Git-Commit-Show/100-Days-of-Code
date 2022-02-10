def countVowel(s):
    vowels=['a','e','i','o','u']
    count=0
    for i in s.lower():
        if(i in vowels):
            count+=1
    return count

n=input('Enter String : ')
print('Vowel count :',countVowel(n))
