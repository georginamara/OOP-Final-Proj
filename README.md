# PiggInnovations
  The PiggInnovations System is a Java-based platform that connects pig farmers and buyers, simplifying the trading process. It allows farmers to list their pigs for sale and buyers to find trusted sellers, promoting efficient communication and transparency in the agricultural market.

## Overview
  The PiggInnovations System is a Java-based application designed to bridge the gap between pig farmers and buyers. It automates the process of registering users, managing pig data, and viewing registered participants, making the trading process more efficient and transparent. Farmers can list their pigs for sale with details such as breed, price, and ID, while buyers can search for sellers and view their information.

By integrating object-oriented programming (OOP) principles, the system achieves scalability, maintainability, and reusability. The project also aligns with Sustainable Development Goals (SDGs) by promoting economic growth and fostering responsible consumption and production in the agricultural market.

## OOP Principles
  The PiggInnovations System incorporates the four key principles of OOP:

 -  **Encapsulation**
    - *Encapsulation* is achieved by using private attributes in classes and exposing controlled access through getter and setter methods. The Pig class encapsulates attributes like id, breed, and price and provides controlled access through a toString method.
-  **Inheritance**
    - *Inheritance* is implemented through the User abstract class, which serves as a base for the Farmer and Buyer classes. Both Farmer and Buyer inherit common attributes (name, contactInfo, location) from the User class. They also override the abstract displayInfo method to provide unique behavior.
-  **Polymorphism**
    - *Polymorphism* is applied through method overriding in the Farmer and Buyer classes. The displayInfo method in the Farmer class displays pig details, while in the Buyer class, it only shows contact information.
-  **Abstraction**
    - *Abstraction* is achieved by using the User class as an abstract base class. This allows hiding implementation details while forcing subclasses to implement the displayInfo method.

## Sustainable Development Goals
- **SDG 8: Decent Work and Economic Growth**
    - The PiggInnovations System promotes economic growth by simplifying the process of connecting farmers and buyers.
    - Farmers can list their pigs and directly reach potential buyers, cutting out middlemen and maximizing profits.

- **SDG 12: Responsible Consumption and Production**
    - The system fosters transparency by providing clear information about pigs for sale, including breed, price, and ID.
    - Buyers can make informed decisions, leading to more responsible consumption and reduced waste in agricultural trading.

## Instructions for Running the Program
I. View Farmers
- The system displays a list of registered farmers. Each farmer's details include their name, contact information, location, and a list of pigs for sale. For each pig, the system shows its ID, breed, and price. The user can review these details and return to the main menu.

II. View Buyers
- The system displays a list of registered buyers, including their name, contact information, and location. This feature helps farmers identify potential buyers and allows users to return to the main menu afterward.

III. Registration
- The user is prompted to choose whether to register as a Farmer or a Buyer:

  - Farmer Registration: The system collects the farmer's name, contact information, and location. Farmers are also prompted to input details about their pigs, including ID, breed, and price, which are stored in their profile.
  - Buyer Registration: The system collects the buyer's name, contact information, and location.
Once registration is complete, the user is asked if they want to register another account or return to the main menu.

IV. Exit
- When the user selects "Exit," the program terminates and stops executing. A goodbye message is displayed to confirm the end of the session.
