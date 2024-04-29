from joinwords import append
from joinwords import appends

def test_that_append_strings():
	assert append('dig') == 'diging'
	assert append('school') == 'schooling'

def test_that_append_strings():
	assert appends('bi') == 'bi'
	assert appends('do') == 'do'