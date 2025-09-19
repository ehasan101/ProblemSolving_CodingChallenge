
#Write a code to return True if the list’s first and last numbers are the same. If the numbers are different, return False.


def check_first_last(nums):
    if nums.index(nums[0]) == nums.index(nums[-1]):
        print(f"True for {nums}")
    else:
        print(f"False for {nums}")



numbers_x = [10, 20, 30, 40, 10]
numbers_y = [75, 65, 35, 75, 30]

check_first_last(numbers_x)
check_first_last(numbers_y)
