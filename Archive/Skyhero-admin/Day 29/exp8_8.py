with open('test.txt', 'w') as file:
	content = input('Write into file: ')
	file.write(content)

with open('test.txt', 'a') as file:
	s = ''
	while s!= '@':
		file.write(s)
		s = input('Append into file: ')

with open('test.txt') as file:
	print(file.read())