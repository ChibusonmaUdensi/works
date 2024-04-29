def max(numbers):
	large = 0
	for num in numbers:
		if num > large:
			large = num

		return large

print(max([8 , 4, 9, 2, 5, 7, 3]))