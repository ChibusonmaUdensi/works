def square(number):
	return number ** 2

print(square(50))
print(square(115))
print(square(925))

def add(a,b=7):
	answer = a + b
	return answer

print(add(6, 7))
print(add(9, 12))
print(add(11, 15))
print(add(8))

def summation(numbers, x):
	total = 0
	for i in numbers:
		total +=  i
	return total + x

print(summation([10, 20, 25, 15, 30], 50))
print(summation(x=50, numbers=[10, 20, 25, 15, 30]))