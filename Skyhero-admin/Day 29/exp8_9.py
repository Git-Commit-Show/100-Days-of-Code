def count():
	count_line = 0
	count_word = 0
	count_chr = 0
	with open('test.txt') as file:
		for line in file:
			for word in line.split():
				for ch in word:
					count_chr +=1
				count_word +=1
			count_line +=1
	return (count_line, count_word, count_chr)

line, word, ch = count()
print('Number of line: ', word)
print('Number of word: ', word)
print('Number of character: ', ch)