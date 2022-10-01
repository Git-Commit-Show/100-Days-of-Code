def countSpace():
	count = 0
	with open('test.txt') as file:
		for line in file:
			if ' ' in line:
				count += line.count(' ')
	print(count)
	return count

def replaceSpace():
	with open('test.txt') as file:
		content = file.read()
	content = content.replace(' ', '#')

	with open('test.txt', 'w') as file:
		file.write(content)


count = countSpace()
replaceSpace()
print("Space ' '- occurence: ", count)