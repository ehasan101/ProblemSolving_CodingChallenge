
# Uses functions to test variable accessibility before and after deletion


price = 900

def test1():
    try:
        print("price in 1st function:", price)
    except NameError:
        print("price variable is not available")

def test2():
    try:
        print("price in 2nd function:", price)
    except NameError:
        print("price variable is not available")

print("Before Delete T1:")
test1()
print("Before Delete T2:")
test2()

del price

print("\nAfter Delete T1:")
test1()
print("After Delete T2:")
test2()