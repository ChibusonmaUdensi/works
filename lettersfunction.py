def letters(g):
	lon = g[:2] +  g[len(g)-2:] 

	return lon 

def lastletters(g):
	lon = g[len(g)-2:] +  g[len(g)-2:] 

	return lon 

def emptyletter(g):
	lon = g[len(g)-1:]
	
	return ""