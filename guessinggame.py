WINNING_NUMBER = 4

for guess_number in range(3):
	guess_number = int(input("Guess a number between 1 - 10: "))

	if WINNING_NUMBER == guess_number:
		print('You haave guessed correctly')
		break
	else:
		print('sho ya werey gan')
 
	