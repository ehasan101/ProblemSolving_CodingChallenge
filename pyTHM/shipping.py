"""
    In this project, you'll create a program that calculates the total
    cost of a customers shopping basket, including shipping.

    - If a customer spends over $100, they get free shipping
    - If a customer spends < $100, the shipping cost is $1.20 per kg of the baskets weight

    Print the customers total basket cost (including shipping) to complete this exercise.
"""


customer_basket_cost = 34
customer_basket_weight = 44
per_kg = 1.20

if customer_basket_cost > 100:
    print("Free Shipping")

else:
    Scost = customer_basket_weight * per_kg
    Tcost = customer_basket_cost + Scost

    print("Total basket cost including shipping is " + str (Tcost))







