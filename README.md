
# Refleksi Tutorial 1

Muhammad Yusuf Haikal </br>
NPM 2206081490 </br>

## Reflection 1

### You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code.  If you find any mistake in your source code, please explain how to improve your code!

Based on what i experienced on writing the two new features, some of the clean code principles that i have applied are as follows: 
1. Meanigful name.

This one, especially for function names, has been very much been affected after learning about clean code principles. For example, inside `ProductController.java`, the function that directs to the product create product page is named `createProductPage`, which is very helpful to easily notice which part of the code corresponds to the product creation inside the page.

2. Layout and Formatting <br>
Tidy layout and formatting, by using appropriately placed spaces and typing, really improve efficiency in coding. Good formatting definitely makes it easier to spot and find parts of the code we are trying to change or modify.

Some mistakes i've found during the implementation of the two new features have been mostly typo related. What I would suggest is that try to pay close attention to names and variables, since they can be the very cause of endless debugging.


## Reflection 2

### After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors? 

I feel that unit tests can be very helpful if the code that we are trying to test is a large scale code. For small scale code, it is still very much possible to manually test the code, but it is still useful nonetheless. We can make sure that our unit tests are enough by making the unit tests all code paths, testing all edge cases and error scenarios.

While high code coverage doesn't guarantee the absence of bugs, it does increase the likelihood of detecting issues.

### Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables. What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner!
If we were to create another functional test that is similiar to the prior functional test, with the same setup procedures and instancce variables, it would be a better move to change the original functional test so that we can use it as a base test that contains the general setup procedures and instance variables that can be used by other functional test. By doing this, we are keepeng the cleanliness of the code by implementing the Don't Repeat Yourself principle. 



