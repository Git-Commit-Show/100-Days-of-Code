# Pattern made by Nouman

import turtle,random

t=turtle.Turtle()
turtle.bgcolor("black")
t.color("white")
t.speed(10)
t.pensize(3)
n=10
col =['red','magenta','blue','yellow','green','purple','cyan','pink']
for i in range(5):
	for col in range(4):
		# t.color(col)
		t.circle(100)
		t.left(10)
t.left(70)
t.color("orange")
t.fillcolor("yellow")
t.begin_fill()
t.circle(50)
t.end_fill()

turtle.done()