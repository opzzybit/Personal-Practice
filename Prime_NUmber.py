def prime_number(userinput):
   for number in range (1, userinput):
     print()
     if userinput % 2 == 0:
        return print ("False , it is  a prime number ")
     else :   
         return print ("True , it is not a prime number ")

 
user_input = int(input("Enter any number:  "))

compare = prime_number(user_input)    
