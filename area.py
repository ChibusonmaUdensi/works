import math

def area(radius):
	area_of_circle = math.pi * radius ** 2
	return ("%.2f" % area_of_circle)



print(area(7))