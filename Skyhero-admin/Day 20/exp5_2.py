def checkPalindrome(string):
    return string.lower() == string[::-1].lower()

n=input('Enter String : ')

if checkPalindrome(n):
    print(n,'is a palindrome.')
else:
    print(n,'is not a palindrome.')

