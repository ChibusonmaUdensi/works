def min(numbers):
	small = 2
	for num in numbers:
		if num < small:
			small = num

		return small

print(min([8 , 4, 9, 2, 5, 7, 3]))