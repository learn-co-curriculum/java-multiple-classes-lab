# Multiple Classes Lab

## Learning Goals

- Implement an application with two classes related through composition.

## Instructions

Fork and clone this lab. The project contains a class `MenuItem` that
encapsulates the name and price of an item on a restaurant
menu.  Do not alter the `MenuItem` class.

The `Menu` class constructor initializes an array of `MenuItem` objects.

You will update the `Menu`  methods
to pass the Junit tests in the `MenuTest` class.

## Task #1 - Get menu item

Edit the `Menu` class to implement the `get(int i)` method,
which should return the element at index `i` in the array
if the index is within the array bounds.  The method should
return `null` if the index is out of bounds (less than 0 or greater
than or equal to array length).

Edit the `MenuTest` class to remove the `@Disabled`
annotation on the `get` and `getOutOfBounds` test methods.
Confirm both tests pass.


## Task #2 - Item Lookup

Edit the `Menu` class to implement the `itemLookup(String name)`
method. The method should search the array to find
the `MenuItem` element with a name that matches the `name` parameter.
Return `null` if the element is not found.

Edit the `MenuTest` class to remove the `@Disabled` annotation on
the `itemLookup` and `itemNotFound` test methods.
Confirm both tests pass.



## Task #3 - Adjust price

Edit the `Menu` class to implement the
`adjustPrice(int i, double amount)` method.
If the index is within bounds,
the method should add the `amount` (which might be negative)
to the price of the element at index `i`, .
Return a boolean value indicating whether the index
was within bounds.

Edit the `MenuTest` class to remove the `@Disabled` annotation
on the `adjustPrice` test method. Confirm the test passes.


## Task #4 - Display items

Edit the `Menu` class to implement the `displayMenuItems()`
method.  The method should iterate throught the array and
print the name and price of each item on a separate line as shown
in the Junit test method.  Note the `Menu` class does not contain
a `toString()` method, so you will have to call the getter methods
to access the object state.

Edit the `MenuTest` class to remove the `@Disabled` annotation
on the `displayMenuItems` test method. Confirm the test passes.
