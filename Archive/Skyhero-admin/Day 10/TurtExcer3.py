import turtle

# turtle object
t = turtle.Turtle()
t.pensize(6)
turtle.bgcolor("#5383C1")
t.speed(9)

# function for creation of eye
def eye(col, rad):
	t.down()
	t.fillcolor(col)
	t.begin_fill()
	t.circle(rad)
	t.end_fill()
	t.up()

# function for cheeks
def cheek():
	t.down()
	t.fillcolor("#D03D3D");
	t.begin_fill()
	t.circle(20)
	t.end_fill()
	t.up()

# draw face
t.fillcolor('yellow')
t.begin_fill()
t.circle(100)
t.end_fill()
t.up()

# draw eyes
t.goto(-40, 120)
eye('white', 10)
t.goto(-37, 125)
eye('black', 5)
t.goto(40, 120)
eye('white', 10)
t.goto(37, 125)
eye('black', 5)

# draw nose
t.goto(0, 75)
eye('black', 8)

#draw cheek
t.goto(-80, 80)
cheek()
t.goto(80, 80)
cheek()

# draw mouth
t.goto(-40, 85)
t.down()
t.right(90)
t.circle(20, 180)
t.up()
t.goto(0, 85)
t.down()
t.right(180)
t.circle(20, 180)
t.up()

# Drawing left Ear
t.goto(-67,180)
t.down()
t.left(58)
t.fillcolor('#C29349')
t.begin_fill()
t.circle(30, 180)
t.end_fill()
t.up()

# Drawing right ear
t.goto(85, 150)
t.down()
t.right(-73)
t.fillcolor('#C29349')
t.begin_fill()
t.circle(30, 180)
t.end_fill()
t.up()

# draw tongue
t.goto(-30, 65)
t.down()
t.right(-48)
t.fillcolor('white')
t.begin_fill()
t.circle(30, 180)
t.lt(90)
t.fd(60)
t.end_fill()
t.hideturtle()

turtle.done()