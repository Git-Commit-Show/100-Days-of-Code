def lowerToUpper():
	wordList = []
	with open('test.txt') as file:
		content = file.read()

	new_str = ''
	for ch in content:
		if ch.isalpha() and ch.islower():
			new_str += ch.upper()
		else:
			new_str += ch

	with open('test.txt', 'w') as file:
		file.write(new_str)

lowerToUpper()
