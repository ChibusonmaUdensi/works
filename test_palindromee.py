from palindromee import is_palindrome

def test_for_palindrome_returns_true():
	assert is_palindrome('dad') == true
	assert is_palindrome('12121') == true
	assert is_palindrome('neveroddoreven') == true

def test_for_palindrome_returns_falsee():
	assert is_palindrome('ball') == false
	