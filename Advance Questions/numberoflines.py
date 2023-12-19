try:
        open_file = open("demo.txt","r") 
        count  = 0
        text = open_file.read()
        for x in text: 
            if x: 
                count += 1
  
        print("No. of lines are", count )

except:
     print("File not found")