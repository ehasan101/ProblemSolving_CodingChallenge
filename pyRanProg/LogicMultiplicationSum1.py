'''Given two integer numbers, write a Python program to return their product only if the product is equal to or lower than 1000. Otherwise, return their sum. '''


def func(a,b):
    product = (a*b)
    if product <= 1000:
        #print(product)
        return product
    
    else:
        return (a+b)

n1 = int(input())
n2 = int(input())

finalCall = func(n1,n2)
print(f"The answer is: {finalCall}")
