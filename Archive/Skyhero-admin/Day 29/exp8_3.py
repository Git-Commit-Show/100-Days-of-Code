def countWord(word):
	count = 0
	with open('test.txt') as file:
		for line in file:
			if word in line:
				count += line.count(word)
	return count

word = input('Enter word: ')
count = countWord(word)
print(word, '- occurence: ', count)