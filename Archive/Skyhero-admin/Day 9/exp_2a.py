# Pentagon made by Nouman

import turtle,random

col=["red", "yellow", "green", "purple", "blue"]
t=turtle.Turtle()
t.pensize(3)

for i in range(5):
	for p in range(5):
		t.color(random.choice(col))
		t.right(72)
		t.fd(100)
	t.right(72)
turtle.done()