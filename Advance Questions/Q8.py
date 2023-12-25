# You need to write a function that accepts an encoded string as a parameter. This
# string will contain a first name, last name, and an id.
# Values in the string can be separated by any number of zeros. The id is a numeric
# value but will contain no zeros. The function should parse the string and return a
# Python dictionary that contains the first name, last name, and id values.
# An example input would be “Robert000Smith000123”. The function should return the
# following using that input:
# { “first_name”: “Robert”, “last_name”: “Smith”, “id”: “123” }

def parse_encoded_string(encoded_string):

  parts = encoded_string.split("0") 
  parts = [part for part in parts if part] 

  if len(parts) != 3:
    raise ValueError("Invalid encoded string format")

  return {
    "first_name": parts[0],
    "last_name": parts[1],
    "id": parts[2]
  }

encoded_string = "Robert0000Smith00000123"
parsed_data = parse_encoded_string(encoded_string)
print(parsed_data)
