'''
Write Python code to iterate through the first 10 numbers and, in each iteration, print the sum of the current and previous number.
'''

previous_num = 0
current_num = 1

for i in range(13):
    if i < 10:
        sum_num = previous_num + current_num
        print(f"Current Number: {current_num}, Previous Number: {previous_num}, Sum: {sum_num}")        
        previous_num = current_num
        current_num += 1

    else:
        break

