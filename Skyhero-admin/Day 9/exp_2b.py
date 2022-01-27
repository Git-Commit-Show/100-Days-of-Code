# Hexagon made by Nouman

import turtle,random

col=["red", "yellow", "green", "purple", "blue"]
t=turtle.Turtle()
t.pensize(3)

for i in range(6):
	for p in range(6):
		t.color(random.choice(col))
		t.right(60)
		t.fd(100)
	t.right(60)
turtle.done()