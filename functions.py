def save_as_csv(toCSV=[]):
	# toCSV = [{'name':'bob','age':34,'weight':200},
	#          {'name':'jim','age':31,'weight':180}]
	keys = toCSV[0].keys()
	with open('check_analysis.csv', 'wb') as output_file:
	    dict_writer = csv.DictWriter(output_file, keys)
	    dict_writer.writeheader()
	    dict_writer.writerows(toCSV)
