import string
def encrypt(text, key):
lol=string.ascii_letters
alpha = string.ascii_letters + string.punctuation + string.digits + " "
res = ""
for i in text:
z = (alpha.index(i)+key)%len(alpha)
res+ = alpha[z]
return res
def decrypt(cipher, key):
alpha = string.ascii_letters + string.punctuation + string.digits + " "
res = ""
for i in cipher:
z = (alpha.index(i)-key)%len(alpha)
res+ = alpha[z]
return res
n = input("Enter text to be encrypted: ")
key = int(input("Enter the key for encryption: "))
print("Encrypted Text: ", encrypt(n, key))
print("Decrypted Text: ", decrypt(encrypt(n, key), key))