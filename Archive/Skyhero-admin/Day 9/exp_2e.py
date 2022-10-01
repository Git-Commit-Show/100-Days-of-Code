# Decagon made by Nouman

import turtle,random

col=["red", "yellow", "green", "purple", "blue"]
t=turtle.Turtle()
t.pensize(3)

for i in range(36):
	for p in range(36):
		t.color(random.choice(col))
		t.right(40)
		t.fd(75)
	t.right(40)
turtle.done()