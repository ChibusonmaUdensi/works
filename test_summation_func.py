from summation import summation

def test_summation_func():
	assert summation(1, 2, 3, 4, 5) == 15
	assert summation(4, 5) == 9
	assert summation(5, 7, 9) == 23
	assert summation(2, 3, 6, 7, 7, 8, 10, 40, 20, 25) == 128
	assert summation(12, 34, 23, 56, 22, 19, 49, 33, 34) == 282