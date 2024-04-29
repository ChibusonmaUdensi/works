def oddindex(word):
	letters = 0
	for index in range(len(word)):
		if index%2 == 1:
			letters += index
		