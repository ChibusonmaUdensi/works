import random


number = random.randrange(1, 10)

guess_number = int(input("Guess a number between 1 - 10: "))

while guess_number != number:
		guess_number = int(input("Guess a number between 1 - 10: "))

		print(number)
		
else:
		print('sho ya werey gan')
 
	