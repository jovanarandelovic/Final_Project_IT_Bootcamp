# Final_Project_IT_Bootcamp
This is a final project before completion of the course Quality Assurance taught by IT Bootcamp in Serbia. It is based on the Selenium testing framework and implements TestNG and Apache POI libraries.
This automation test can be run on ChromeDriver

http://demo.yo-meals.com/ (developed by FATbit Technologies) demo Web app's different functionalities were tested in three different tests.

(A) ProfileTest() class contains two independent tests:
---EditProfileTest() that
  (1) navigates to the login form page
  (2) closes a pop-up navigation dialogue
  (3) logs in with demo credentials
  (4) verifies if the login is successful
  (5) navigates to profile page
  (6) changes customer data such as first name, last name, address, phone number, zip code, country, state, and city
  (7) verifies if the profile setup is successful
  (8) logs out
  (9) verifies if the logout is successful
 
 ---ChangeProfileImageTest() 
  (1) navigates to the login form page
  (2) closes a pop-up navigation dialogue
  (3) logs in with demo credentials
  (4) verifies if the login is successful
  (5) navigates to profile page
  (6) changes a profile photo
  (7) verifies if the profile photo was updated
  (8) deletes the profile photo
  (9) verifies if the profile photo is deleted
  (10) logs out
  (11) verifies if the logout is successful
 
(B) MealItemTest() class contains three independent tests:
 ---AddMealToCartTest() that
  (1) navigates to a specific meal item page
  (2) closes a pop-up navigation dialogue
  (3) adds 4x the same meal item to the cart
  (4) verifies if the location error message appears
  (5) opens up a navigation dialogue
  (6) sets the chosen location
  (7) repeats step 3
  (8) verifies if the meal is added to the cart
 
 ---AddMealToFavoriteTest() that
  (1) navigates to a specific meal item page
  (2) clicks on the "add to favorites" button
  (3) verifies if the warning message appears to log in first
  (4) navigates to the login form page
  (5) logs in with demo credentials
  (6) repeats step 1
  (7) repeats step 2
  (8) verifies if the product was added to favorites
  
  ---ClearCartTest() that
  (1) navigates to meals page
  (2) sets the location
  (3) reads URLs from an .xlsx file
  (4) navigates to provided meal items pages
  (5) adds 2x each meal from a corresponding URL to a cart
  (5) verifies if the meal items were added to the cart
  (6) clears the cart
  (7) verifies if the cart is cleared
  
(C) SearchTest() class contains one test
---SearchMealTest() that
  (1) navigates to meals page
  (2) sets the location
  (3) reads from an .xlsx file
  (4) opens up a page from a URL provided in an .xlsx file
  (5) changes the location based on the information from an .xlsx file
  (6) checks if the number of meal items present on that specific meal page at the specific location is equal to the number of items in the .xlsx file
  (7) checks if the meal item names on the specific meal page at the specific location are identical to the meal item names provided in the .xlsx file
 
