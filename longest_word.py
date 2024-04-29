def longest(*list):
	longest_word = 0
	for word in list:
		if len(word) > longest_word:
			longest_word = len(word)
			return longest_word
			return len(word)