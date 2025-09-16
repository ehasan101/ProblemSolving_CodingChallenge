"""
Write a Python code to accept a string from the user and display characters present at an even index number.
"""

str = input()
size = len(str)

print("Orginal String is: ",str)
print("Printing only even index chars: ")

for i in range(0 , size):
    if i % 2 == 0:
        print(str[i], end="") 