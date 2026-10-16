import random


#THE LIST
length_list = []

for number in range(1,10):
     opzzy = random.randint(1,50)
     length_list.append(opzzy) 

print(length_list )
 

#LENGTH
length = 0

for number in range (number+1):
        length = number 

print(f"The length of the list index = {length}")


#EVEN NUMBER SUM
count_even = 0

if  length_list[0] % 2 == 0: 
        count_even += length_list[0]

if  length_list[1] % 2 == 0: 
        count_even += length_list[1]     

if  length_list[2] % 2 == 0: 
        count_even += length_list[2]     

if  length_list[3] % 2 == 0: 
        count_even += length_list[3]     

if  length_list[4] % 2 == 0: 
        count_even += length_list[4]

if  length_list[5] % 2 == 0: 
        count_even += length_list[5]     

if  length_list[6] % 2 == 0: 
        count_even += length_list[6]     

if  length_list[7] % 2 == 0: 
        count_even += length_list[7]     
if  length_list[8] % 2 == 0: 
        count_even += length_list[8]     
print(f"The sum of the even number = {count_even}")


#SUM OF THE ODD NUMBER

count_odd = 0

if  length_list[0] % 2 != 0: 
        count_odd += length_list[0]

if  length_list[1] % 2 != 0: 
        count_odd += length_list[1]     

if  length_list[2] % 2 != 0: 
        count_odd += length_list[2]     

if  length_list[3] % 2 != 0: 
        count_odd += length_list[3]     

if  length_list[4] % 2 != 0: 
        count_odd += length_list[4]

if  length_list[5] % 2 != 0: 
        count_odd += length_list[5]     

if  length_list[6] % 2 != 0: 
        count_odd += length_list[6]     

if  length_list[7] % 2 != 0: 
        count_odd += length_list[7]     
if  length_list[8] % 2 != 0: 
        count_odd += length_list[8]     
print(f"The sum of the odd number = {count_odd}")


#THIRD INDEX MULTIPLICATION

multiplied_list = length_list[2] * length_list[5] * length_list[8]

print(f"The multiple of the third list = {multiplied_list}")


#AVERAGE OF THE ELEMENT IN THE LIST


for number in range (length):
    length_sum = length_list[0] + length_list[1] + length_list[2] + length_list[3] + length_list[4]
    length_sum_two = length_list[5] + length_list[6] + length_list[7] +  length_list[8]
    
    general_number = length_sum + length_sum_two
    average = general_number / length 
    
print(f"average{ average}  ")




#LARGEST NUMBER IN THE LIST

largest = length_list[0]


if  length_list[1] > largest: 
        largest = length_list[1]

if  length_list[2] > largest: 
        largest = length_list[2]

if  length_list[3] > largest: 
        largest = length_list[3] 

if  length_list[4] > largest: 
        largest = length_list[4]

if  length_list[5] > largest: 
        largest = length_list[6]

if  length_list[6] > largest: 
        largest = length_list[6]

if  length_list[7] > largest: 
        largest = length_list[7]    

if  length_list[8] > largest: 
        largest = length_list[8]

print(f"The largest number = {largest}")




#SMALLEST NUMBER IN THE LIST

smallest = length_list[0]


if  length_list[1] < smallest : 
        smallest  = length_list[1]

if  length_list[2] < smallest : 
        smallest  = length_list[2]

if  length_list[3] < smallest : 
        smallest  = length_list[3]

if  length_list[4] < smallest : 
        smallest  = length_list[4]

if  length_list[5] < smallest : 
        smallest  = length_list[5]

if  length_list[6] < smallest : 
        smallest  = length_list[6]

if  length_list[7] < smallest : 
        smallest  = length_list[7]

if  length_list[8] < smallest : 
        smallest  = length_list[8]

print(f"The smallest number = {smallest}")



#

