<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Final_Project_IT_Bootcamp_0"></a>Final_Project_IT_Bootcamp</h1>
<p class="has-line-data" data-line-start="1" data-line-end="3">This is a final project before completion of the course Quality Assurance taught by IT Bootcamp in Serbia. It is based on the Selenium testing framework and implements TestNG and Apache POI libraries. This automation test can be run on ChromeDriver 85.0.4183.87<br>
<img src="https://alternative.me/media/256/selenium-icon-r8to6r6vkc0esz9w-c.png" alt=""></p>
<hr>
<p class="has-line-data" data-line-start="7" data-line-end="8"><a href="http://demo.yo-meals.com/">http://demo.yo-meals.com/</a> (developed by FATbit Technologies) demo Web app’s different functionalities were tested in three different tests.</p>
<p class="has-line-data" data-line-start="9" data-line-end="10"><img src="https://www.yo-meals.com/images/logo.png" alt=""></p>
<hr>
<h2 class="code-line" data-line-start=14 data-line-end=15 ><a id="TESTS_14"></a><strong>TESTS</strong></h2>
<h3 class="code-line" data-line-start=16 data-line-end=17 ><a id="ProfileTest_class_contains_two_independent_tests_16"></a><em>ProfileTest()</em> class contains two independent tests:</h3>
<h4 class="code-line" data-line-start=18 data-line-end=19 ><a id="EditProfileTest_18"></a>EditProfileTest()</h4>
<ol>
<li class="has-line-data" data-line-start="19" data-line-end="20">navigates to the login form page</li>
<li class="has-line-data" data-line-start="20" data-line-end="21">closes a pop-up navigation dialogue</li>
<li class="has-line-data" data-line-start="21" data-line-end="22">logs in with demo credentials</li>
<li class="has-line-data" data-line-start="22" data-line-end="23">verifies if the login is successful</li>
<li class="has-line-data" data-line-start="23" data-line-end="24">navigates to profile page</li>
<li class="has-line-data" data-line-start="24" data-line-end="25">changes customer data such as first name, last name, address, phone number, zip code, country, state, and city</li>
<li class="has-line-data" data-line-start="25" data-line-end="26">verifies if the profile setup is successful</li>
<li class="has-line-data" data-line-start="26" data-line-end="27">logs out</li>
<li class="has-line-data" data-line-start="27" data-line-end="29">verifies if the logout is successful</li>
</ol>
<h4 class="code-line" data-line-start=29 data-line-end=30 ><a id="ChangeProfileImageTest_29"></a>ChangeProfileImageTest()</h4>
<ol>
<li class="has-line-data" data-line-start="30" data-line-end="32">navigates to the login form page<br>
`2. closes a pop-up navigation dialogue</li>
<li class="has-line-data" data-line-start="32" data-line-end="33">logs in with demo credentials</li>
<li class="has-line-data" data-line-start="33" data-line-end="34">verifies if the login is successful</li>
<li class="has-line-data" data-line-start="34" data-line-end="35">navigates to profile page</li>
<li class="has-line-data" data-line-start="35" data-line-end="36">changes a profile photo</li>
<li class="has-line-data" data-line-start="36" data-line-end="37">verifies if the profile photo was updated</li>
<li class="has-line-data" data-line-start="37" data-line-end="38">deletes the profile photo</li>
<li class="has-line-data" data-line-start="38" data-line-end="39">verifies if the profile photo is deleted</li>
<li class="has-line-data" data-line-start="39" data-line-end="40">logs out</li>
<li class="has-line-data" data-line-start="40" data-line-end="42">verifies if the logout is successful</li>
</ol>
<h3 class="code-line" data-line-start=42 data-line-end=43 ><a id="MealItemTest_class_contains_three_independent_tests_42"></a><em>MealItemTest()</em> class contains three independent tests:</h3>
<h4 class="code-line" data-line-start=44 data-line-end=45 ><a id="AddMealToCartTest_44"></a>AddMealToCartTest()</h4>
<ol>
<li class="has-line-data" data-line-start="45" data-line-end="46">navigates to a specific meal item page</li>
<li class="has-line-data" data-line-start="46" data-line-end="47">closes a pop-up navigation dialogue</li>
<li class="has-line-data" data-line-start="47" data-line-end="48">adds 4x the same meal item to the cart</li>
<li class="has-line-data" data-line-start="48" data-line-end="49">verifies if the location error message appears</li>
<li class="has-line-data" data-line-start="49" data-line-end="50">opens up a navigation dialogue</li>
<li class="has-line-data" data-line-start="50" data-line-end="51">sets the chosen location</li>
<li class="has-line-data" data-line-start="51" data-line-end="52">repeats step 3</li>
<li class="has-line-data" data-line-start="52" data-line-end="54">verifies if the meal is added to the cart</li>
</ol>
<h4 class="code-line" data-line-start=54 data-line-end=55 ><a id="AddMealToFavoriteTest_54"></a>AddMealToFavoriteTest()</h4>
<ol>
<li class="has-line-data" data-line-start="55" data-line-end="56">navigates to a specific meal item page</li>
<li class="has-line-data" data-line-start="56" data-line-end="57">clicks on the “add to favorites” button</li>
<li class="has-line-data" data-line-start="57" data-line-end="58">verifies if the warning message appears to log in first</li>
<li class="has-line-data" data-line-start="58" data-line-end="59">navigates to the login form page</li>
<li class="has-line-data" data-line-start="59" data-line-end="60">logs in with demo credentials</li>
<li class="has-line-data" data-line-start="60" data-line-end="61">repeats step 1</li>
<li class="has-line-data" data-line-start="61" data-line-end="62">repeats step 2</li>
<li class="has-line-data" data-line-start="62" data-line-end="64">verifies if the product was added to favorites</li>
</ol>
<h3 class="code-line" data-line-start=64 data-line-end=65 ><a id="ClearCartTest_64"></a>ClearCartTest()</h3>
<ol>
<li class="has-line-data" data-line-start="65" data-line-end="66">navigates to meals page</li>
<li class="has-line-data" data-line-start="66" data-line-end="67">sets the location</li>
<li class="has-line-data" data-line-start="67" data-line-end="68">reads URLs from an .xlsx file</li>
<li class="has-line-data" data-line-start="68" data-line-end="69">navigates to provided meal items pages</li>
<li class="has-line-data" data-line-start="69" data-line-end="70">adds 2x each meal from a corresponding URL to a cart</li>
<li class="has-line-data" data-line-start="70" data-line-end="71">verifies if the meal items were added to the cart</li>
<li class="has-line-data" data-line-start="71" data-line-end="72">clears the cart</li>
<li class="has-line-data" data-line-start="72" data-line-end="74">verifies if the cart is cleared</li>
</ol>
<h3 class="code-line" data-line-start=74 data-line-end=75 ><a id="SearchTest_class_contains_one_test_74"></a><em>SearchTest()</em> class contains one test</h3>
<h4 class="code-line" data-line-start=76 data-line-end=77 ><a id="SearchMealTest_76"></a>SearchMealTest()</h4>
<ol>
<li class="has-line-data" data-line-start="77" data-line-end="78">navigates to meals page</li>
<li class="has-line-data" data-line-start="78" data-line-end="79">sets the location</li>
<li class="has-line-data" data-line-start="79" data-line-end="80">reads from an .xlsx file</li>
<li class="has-line-data" data-line-start="80" data-line-end="81">opens up a page from a URL provided in an .xlsx file</li>
<li class="has-line-data" data-line-start="81" data-line-end="82">changes the location based on the information from an .xlsx file</li>
<li class="has-line-data" data-line-start="82" data-line-end="83">checks if the number of meal items present on that specific meal page at the specific location is equal to the number of items in the .xlsx file</li>
<li class="has-line-data" data-line-start="83" data-line-end="85">checks if the meal item names on the specific meal page at the specific location are identical to the meal item names provided in the .xlsx file</li>
</ol>
