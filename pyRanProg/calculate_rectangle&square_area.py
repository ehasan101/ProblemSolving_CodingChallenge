
def calculate_square_area (side):
    result1 = (side*side)
    return result1

def calculate_rectangle_area (leng, wid):
    result2 = (leng*wid)
    return result2


sqr = float(input())

print(f"square area is {calculate_square_area(sqr)}")
print(f"rectangle area is {calculate_rectangle_area(11, 20.5)}")