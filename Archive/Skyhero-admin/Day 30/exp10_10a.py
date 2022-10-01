# Function calling
def dictionairy():
 # Declare hash function     
 key_value ={}   
 
# Initializing value
 key_value[2] = 56      
 key_value[1] = 2
 key_value[5] = 12
 key_value[4] = 24
 key_value[6] = 18     
 key_value[3] = 323
 
 print ("Task 1:-\n")
 print ("Keys are")
  
 # iterkeys() returns an iterator over the
 # dictionary’s keys.
 for i in sorted (key_value.keys()) :
     print(i, end = " ")
 
def main():
    # function calling
    dictionairy()            
     
# Main function calling
if __name__=="__main__":     
    main()