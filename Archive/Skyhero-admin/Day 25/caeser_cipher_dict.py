import string
def encrypt(str, key):
s = string.ascii_letters + string.punctuation+string.digits+" "
dict={}
res=""
for i in range(len(s)):
dict[s[i]]=s[(i+key) % len(s)]
for ch in str:
res += dict[ch]
return res
def decrypt(str, key):
s = string.ascii_letters + string.punctuation+string.digits+" "
dict={}
res=""
for i in range(len(s)):
dict[s[i]]=s[(i-key) % len(s)]
for ch in str:
res += dict[ch]
return res
text = input("Enter String: ")
key = int(input("Enter key: "))
print("\nEncrypted String: ",encrypt(text, key))
print("Decrypted String: ", decrypt(encrypt(text, key), key))