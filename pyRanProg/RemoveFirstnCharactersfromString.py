
# Write a Python code to remove characters from a string from 0 to n and return a new string.

def remove_chars(word, n):
    res = word[n:]
    return res


str = input()
no = int(input())

print("Orginal String: ", str)
print("Removing characters from a string: ",remove_chars(str, no))

