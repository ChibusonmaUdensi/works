from largest import is_largest
from largest import is_smallest


def test_that_calculates_max():
	assert is_largest(34, 32, 9) == 34
	assert is_largest(87, 55, 90) == 90

def test_that_calculates_min():
	assert is_smallest(34, 32, 9) == 9
	assert is_smallest(87, 55, 90) == 55

