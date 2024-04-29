from lettersfunction import letters
from lettersfunction import lastletters
from lettersfunction import emptyletter

def test_that_counts_letters():
	assert letters('semicolon') == 'seon'
	assert letters('sikiru') == 'siru'
	assert letters('maesdining') == 'mang'

def test_that_counts_letters():
	assert lastletters('on') == 'onon'
	assert lastletters('fe') == 'fefe'
	assert lastletters('fo') == 'fofo'
	
def test_that_counts_letters():
	assert emptyletter('n') == ""
	