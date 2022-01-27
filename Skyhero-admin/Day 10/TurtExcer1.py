import turtle

angle,size=120,90
turtle.bgcolor("black")
turtle.color("blue")
turtle.width(4)
turtle.fillcolor("white")
turtle.begin_fill()

for side in range(5):
	turtle.forward(size)
	turtle.right(angle)
	turtle.forward(size)
	turtle.right(72-angle)
turtle.end_fill()
turtle.done()