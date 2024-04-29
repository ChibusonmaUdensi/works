amount = int(input( "Enter an amount"))
time = int(input ("How many years?"))
rate = 20

count = 1
for i in range(time):
	rate = 20 / 100;
	interest = rate * amount 
	increase = interest + amount
	
	print ("Year ", count, round(increase, 2))
	count +=1