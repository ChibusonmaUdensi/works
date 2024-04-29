from longest_word import longest

def test_that_checks_longest_word():
	assert longest('cake', 'sex', 'relax', 'malfunction', 'slipper') == 'malfunction'
	assert longest('bag', 'dream', 'arouse', 'comm', 'punctuation') == 'punctuation'
	assert longest('bo', 'housekeeper', 'photosynthesis', 'weed' 'hoe') == 'photosynthesis'