print("             GUESS THE COLOR        ")

favourite_color = "blue"

for number in range (0,3,1):
 
  user_input = str(input("""GUESS A COLOR AND WIN A PRICE : 
  """))
  print ()
  if user_input == favourite_color:
          print ("Correct !")
          print ("congrats you have won $20 !")
          break; 
  if user_input == "green":
          print ("you are close!")
  else:
        print ("Wrong!")      

            












