def copyImg():
	with open('image.jpg', 'rb') as file:
		content = file.read()

	with open('anotherImage.jpg', 'wb') as file:
		file.write(content)

copyImg()