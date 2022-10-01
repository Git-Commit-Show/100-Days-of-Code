import string

def encode(str):
	s = string.ascii_letters + " "
	dic = {}
	enc = ""
	for i in range(len(s)):
		dic[s[i]] = s[(i + 3) % len(s)]
	for ch in str:
		enc += dic[ch]
	return enc

def decode(str):
	s = string.ascii_letters + " "
	dic = {}
	dec = ""
	for i in range(len(s)):
		dic[s[i]] = s[(i - 3) % len(s)]
	for ch in str:
		dec += dic[ch]
	return dec

content = input('Enter input: ')
enc = encode(content)

with open('test.txt', 'w') as file:
	file.write(enc)

with open('test.txt') as file:
	encoded = file.read()

dec = decode(encoded)
print(dec)