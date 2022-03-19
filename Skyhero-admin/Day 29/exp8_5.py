def copyFile():
	with open('test.txt') as file:
		content = file.read()

	with open('anotherTest.txt', 'w') as file:
		file.write(content)

copyFile()