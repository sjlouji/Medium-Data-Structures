def linearSearch(inputList, searchElement):
	position = -1;
	for i in range(0, len(inputList)):
		_itr = inputList[i]
		if (_itr == searchElement):
			position = i
			break
	return position;

inputList = [1,3,2,6,5,4,9,8,7]
searchElement = 6


position = linearSearch(inputList, searchElement)

if (position != -1):
	print('Search Element found at position: ', position + 1)
else:
	print('Search Element not found')