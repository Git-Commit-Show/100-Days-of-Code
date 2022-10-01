import turtle, random

turtle.title("My Turtle polygon")
turtle.bgcolor("pink")

col=['red', 'yellow', 'green', 'purple', 'blue']

t=turtle.Turtle()
t.pensize(2)

for i in range(6):
	for j in range(6):
		t.speed(20)
		t.fd(80)
		t.left(60)
	t.color(random.choice(col))
	t.left(80)
turtle.done()