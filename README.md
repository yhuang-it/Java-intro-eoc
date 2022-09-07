Create a Car App in Java
OVERVIEW & PURPOSE
You will create a Car App that utilizes the Java skills you have learned thus far.
ACTIVITY
1. Fork project to your Github account
2. Copy the HTTPS URL from the "Code" button
3. Open your terminal (Git bash) and navigate to the appropriate location where you wish to save the folder to. 
4. Enter: git clone URL-you-Copied-goes-here
5. Open VS Code and open cloned project
6. Open your App.java class and edit the main method.
7. Add a new file named Car.java. This is where we will write all of our methods for dealing with our Car class.
8. Create a new file called Toyota.java. (This class should extend your Car class)
9. Create a new file called Lexus.java. (This class should extend your Car class)
10. Create a new file called Honda.java. (This class should extend your Car class)

*** Make all your instance fields private and all your classes and methods public 

11. Your Car class should have the following instance fields. Do not set any default values unless noted.
  a. Type String with the name color
  b. Type int with the name year
  c. Type int with the name speed (initial value 0)
  d. Type int with the name maxSpeed
  e. Type boolean with the name isElectric
  
12. Your Lexus class should have an instance field of type boolean with the name hasLeatherSeats. Do not set a default value here.
13. Your Honda class should have an instance field of type boolean with the name isTurboCharged. Do not set a default value here.
14. Your Toyota Class should have an instance field of type boolean with the name greatGasMileage. Do not set a default value here.
15. In your Car class, create a constructor which takes in the following parameters( String color, int year, int maxSpeed)
16. In your Lexus class, create a constructor which takes in the  parameters for the parent class and boolean hasLeatherSeats
17. In your Honda class, create a constructor which takes in the parameters for the parent class and boolean isTurboCharged
18. In your Toyota class, create a constructor which takes in the parameters for the parent class and boolean greatGasMileage
19. Properly implement a super() method in each child class constructor
20. In your Car class, create getters and setters for each instance field. Do the same within your Toyota, Lexus, and Honda classes.
21. Test your Classes. Over in your App Class:
  a. Create an  instance of your Honda Class and call it civic. 
  b. Create an instance of your Lexus Class and name it rx350. 
  c. Create an instance of your Toyota Class and name it supra. 
  d. Use System.out.println() to print out the value of the color for each instance you’ve created. For example, System.out.println(audiCoupe.getColor());

22. In your Car class, create a method and name it accelerateSpeed. This method should not return anything and should increase the car speed by five MPH. Make sure the speed doesn’t go above the vehicle's maxSpeed value.
23. In your Car class, create a method and name it decelerateSpeed. This method should not return anything and should decrease the car speed by five MPH. Make sure the speed doesn’t go below 0 MPH.
24. In your Car class, create a method and name it convertToElectric. This method should not return anything and should change the value of isElectric to true. If the value of this field is already set to true the method should display a message to the user stating that the Car is already electric.
25. Create Unit tests for accelerateSpeed, decelerateSpeed, and convertToElectric. Each method should have at least 2 tests that various logic is executed inside the method.
26. Push your changes up to your repository. From your git bash terminal, enter the following commands:
  a. git add .
  b. git commit -m “First Commit”
  c. git push -u origin master
27. Go to your GitHub repository. You should see your changes.
28. Create pull request.

*** If you finish early, consider adding some additional functionality of your own. Be creative. Ex. ensure that speed does not exceed max speed.
