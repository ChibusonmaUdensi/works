from add import add

def test_addfunc (a, b):
	if type(a) and type(b) in [int, float]:
		return abs(a) + abs(b)

	return a + b