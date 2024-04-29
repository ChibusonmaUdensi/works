def palindrome(string):

	counter = "" 

	for number in string:
		counter = number + counter
	if (string == counter):
		return True
	else: 
		return False

			
