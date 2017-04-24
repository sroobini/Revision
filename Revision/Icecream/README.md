
# ICE CREAM PROBLEM SOLVED USING DECORATOR DESIGN PATTERN

## Context:
Design a Billing system software for Cold Stone ice cream shop.
The shop has multiple flavors of ice cream such as Vanilla, Strawberry, Chocolate and ButterScotch.

* Flavor        Cost
* Vanilla 		  3$
* Strawberry	  3.5$
* Chocolate		  3.25$
* ButterScotch	4$

It also offers multiple toppings for the ice cream

* Toppings	Cost
* Nuts      1$
* Berries		1.5$
* Caramel		2$
* Fruits		2$

I go with my family the shop and Order the below ice creams


* Strawberry ice cream with Fruits and Caramel
* Vanilla ice cream with Nuts
* Chocolate ice cream with Berries and Nuts

What would be my total bill?
Clue: This design will involve Inheritance, Polymorphism and Composition.


###Classes

* _Icecream_ - Interface
* Decorator child classes that extends the IcecreamDecorator (Eg._BerriesDecorator_)
* Icecream sub classes that implements the Icecream interface (Eg._VanillaIcecream_)
* _IcecreamShop_ - Contains the main class that provides the input

More information are found in the classes themselves.
