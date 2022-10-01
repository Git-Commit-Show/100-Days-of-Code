# Octagon made by Nouman

import turtle,random

col=["red", "yellow", "green", "purple", "blue"]
t=turtle.Turtle()
t.pensize(3)

for i in range(8):
	for p in range(8):
		t.color(random.choice(col))
		t.right(45)
		t.fd(100)
	t.right(45)
turtle.done()