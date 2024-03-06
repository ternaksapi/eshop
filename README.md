Muhammad Yusuf Haikal </br>
NPM 2206081490 </br>
https://eshop-ternaksapi.koyeb.app/<br>

# Refleksi Tutorial 1

## Reflection 1

### You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code.  If you find any mistake in your source code, please explain how to improve your code!

Based on what i experienced on writing the two new features, some of the clean code principles that i have applied are as follows: 
1. Meaningful name.

This one, especially for function names, has been very much been affected after learning about clean code principles. For example, inside `ProductController.java`, the function that directs to the product create product page is named `createProductPage`, which is very helpful to easily notice which part of the code corresponds to the product creation inside the page.

2. Layout and Formatting

Tidy layout and formatting, by using appropriately placed spaces and typing, really improve efficiency in coding. Good formatting definitely makes it easier to spot and find parts of the code we are trying to change or modify.

Some mistakes i've found during the implementation of the two new features have been mostly typo related. What I would suggest is that try to pay close attention to names and variables, since they can be the very cause of endless debugging.


## Reflection 2

### After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors? 

I feel that unit tests can be very helpful if the code that we are trying to test is a large scale code. For small scale code, it is still very much possible to manually test the code, but it is still useful nonetheless. We can make sure that our unit tests are enough by making the unit tests all code paths, testing all edge cases and error scenarios.

While high code coverage doesn't guarantee the absence of bugs, it does increase the likelihood of detecting issues.

### Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables. What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner!
If we were to create another functional test that is similiar to the prior functional test, with the same setup procedures and instancce variables, it would be a better move to change the original functional test so that we can use it as a base test that contains the general setup procedures and instance variables that can be used by other functional test. By doing this, we are keepeng the cleanliness of the code by implementing the Don't Repeat Yourself principle. 


# Refleksi Tutorial 2

## Reflection 1

### List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them.

During this exercise, i found 2 issues that affected the maintainability issue, according to the sonarcloud code analysis. One was on ProductServiceImplTest and the other was on ProductRepositoryTest.java. Both of the issue was caused by a 'public' modifer for the class. To fix them, i simply removed the 'public' modifer, so that it instantly writes `class ProductServiceImplTest {` and `class ProductRepositoryTest {`.

## Reflection 2

### Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? Explain the reasons (minimum 3 sentences)!

In my opinion, the current implementation has met the definition of Continuous Integration and Continuous Deployment. For the Continuous Integration part, it is defined as a software development practice where continuous change & updates in codebase are integrated and verified by an automated build script using various tools (Swaraj, 2017). This one was done in part by the use of code scanning by Sonarcloud, which after every change, automatically analyze the changes and highlight whats the issue, where the issue, and why it is an issue. This is all done by an automated build script. As for the Continuous Deployment, by using koyeb for this exercise, it automatically deploys the newest version of the project, which is what the Continuous Deployment is trying to accomplish. 


# Refleksi Tutorial 3

## Refection 1

### Explain what principles you apply to your project!
- Single Responsibility Principle (SRP)
For SRP, I created a seperate java class for ProductController and CarsController. The reason for this is mainly for maintainability issue, so for example when we only want to change a feature for only the ProductController, we wont affect the CarsController since they are now in two seperate different file, which is the principle of SRP where each Java class should execute only one function.

- Open-Closed Principle (OCP)
One way to achieve OCP is to make it so that we dont have to change the original entities when we want to do modification to the entity, and one way of doing this is by using interface. In the previous code, inside the class `ProductController`, theres this line `private CarServiceImpl carservice;` that is used for `CarsController`. Since `CarServiceImpl` is a class that is created from the interface `CarService`, we run into a risk that might change the entitity `CarService`. To avoid this, I changed it so that instead of importing `CarServiceImpl`, it instead imports the interface `CarService` directly.

- Liskov Substitution Principle (LSP)
By seperating `ProductController` and `CarsController` where now `CarsController` doesn't need to extend 
`ProductController`, we've acchieved LSP since it can now fully replace what `ProductController` did.

- Interface Segregation Principle (ISP)
  Since we've already seperated the interface for Product and Cars, say we want to modify the interface for product that only applies for product and is not needed for Cars, we won't have to implement the change for `CarServiceImpl`, and thus we have applied ISP into our project.

- Dependency Inversions Principle (DIP)
To put short, achieving DIP is done by using interface instead of extending from a concrete classes and function. We can apply this from the previous case wehere we use the `CarService` interface instead of the concrete class `CarServiceImpl`.

## Reflection 2

### Explain the advantages of applying SOLID principles to your project with examples.
While changing a previously written code that hasn't applied SOLID principles might be quite redundant, but on the long term brings a net positive towards the maintainability aspect of the code. For example, applying SOLID principles makes it easier to detect bugs after doing changes to the code. Since we have seperated concerns by using **Single Responsibility Principle**, we can know exactly where the bug might come from just by telling which concerns does the bug relates to. Other than that, since by applying **Dependency Inversions Principle** makes it so that when we want to change a concrete class, we dont have to worry about other concrete class, since we already know that classes only derive from interfaces, making it more efficient. Other advantage might derive from the previously mentioned advantages, like code cleanliness and better security.

## Reflection 3

### Explain the disadvantages of not applying SOLID principles to your project with examples.
The disadvantages of not applying SOLID principles are the complete opposite of the advantages that you get. Simply, the code will not be easy to maintain, whether it is for updates, bug fixes, etc. Since we dont apply **Single Responsibility Principle**, our code might not be in modular form, making it difficult to do changes. For example, say that from the `before-solid` branch, we want to change the `ProductController`. Doing changes there might cause some unwanted changes to `CarsController`, since it extends the class. It might also cause some problem in the security field of the project.

# Refleksi Tutorial 4

## Reflection 1

#### Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests
I've found the TDD flow can be quite tedious, especially coming up with every tests trying to come up with every cases possibility for the module you are going to be working on, but after that it actually is very much useful, since you've already set the target and goals you want to achieve for the function from coming up with the tests, coming up with the code is easier. It also makes it easier to detect if an unwanted change has happened since you can check from the tests if the results are different.

## Reflection 2

### You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.
While I believe the tests that i have made has successfully followed the F.I.R.S.T principle, for instance the tests run fast that they doesnt interrupt my workflow, fulfilling the **Fast** principle, the tests are also **Isolated/Independent**, **Repeatable**, but i still have doubt about them being **Self-Validating** and **Thorough**, since the tests doesn have a 100% code coverage so there might still be possibilites that some paths are still uncovered.

