user_input = input("Enter a word:  ")

string_word = ""
for index in user_input[::-1]:
    string_word += index
    
if string_word == user_input:
   print()
   print("it is palindrome")
  
else:
    print()
    print("it is not palindrome")




























































