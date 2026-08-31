## Contributors
    Brody Dugger, James Kumpulanian, and David Fitzpatrick

---

## Introduction
   - The Goal of our final project is to create a framework that allows users to send emails/messages to each other. 
   - To achieve that, a manager object will keep track of which users are connected to the system and facilitate the sending of messages between users. 
   - User objects will be able to send and receive messages by interacting with the manager object. 
   - Objects implementing the message class will contain the information concerning the format and contents of the message. (i.e., Headers, signatures, the main contents, etc.)

---

## Detail of Process
* Interfaces:
    - Reciever Interface: Used in the user class, it defines what the user can do and what they can recieve. 
        - Methods: DraftEmail(), ShowEmail(), and UpdateConnect().
    
    - Message Interface: Implented in the email class, it constructs how an email is formated. This interface would display the users inbox. 
* Classes:
    - Email Manager: The method AddUsers() uses an array to instances of the user class, each instance is a user of the email system. This email handles methods that can add users and remove users. Method RemoveUsers() also uses an array to access instances of the user class to remove users. There is an added functionality where it won't allow a user to be created if they already exist and won't allow a user to be removed if they do not exist. The method SendEmail() uses an Instance of the email class to construct a message aswell it takes in the first user as the sender and the second user as the reciever. Once the email is sent it is added to an array in reciever with an additional functionality  where you can't send an email to someone who does not exist and you can't send an email if you are not a connected user. The last method GetUsers() just returns an array of all connected users.

    - User Class: This class uses an array to create the users inbox and allows you to make an object of user. Users will be involved as seen in Email Manger, user is used frequently to send and recieve emails. DraftEmail() allows user to save an email but not send the email. ShowEmail() allows users to their entire inbox and makes use of methods from the email class to do so. UpdateConnect() was used to save emails that were sent by throughout the email manager.

    - Email Class: This class is a blueprint for creating emails, the methods  DraftEmail() and SendEmail() uses an instance of email. The methods are part of the blueprint for making emails.

* Main(): 
    - Our main demonstrates the functionality of program. In main() we create two users Alice and Bob. Both Alice and Bob draft and sends  an email to eachother and we show that they recieve their respective email by displaying each users inbox. At the end, Bob and Alice are deleted as connected users. 

---

## Principles
* Abstraction: We use abstract methods in our interfaces.
* Encapsulation: This is shown throughout the program with the use of classes and methods.
* Inheritance: We implent methods from our interfaces and we use methods from other classes.
* Polymorphism: We demonstrate polymorphism by ConnectedUsers and showing emails with inbox.
* Method Overriding: The abstract methods that we used demonstrate method overriding.

---

### SOLID Principles
* SRP: We demonstrate Single Responsibilty through classes like email where the sole purpose is formatting emails.
* OCP: We demonstrate Open Closed through multiple refrences to multiple objects outside of ones class allowing for implementation and modification without closing the class for modification.
* LSP: We demonstrated Liskov Principle through our repeated references to methods outside of ones class without changing the funtionality of those methods.
* ISP: We demonstrated Interface segregation by making sure every class uses methods for its intended purpose without the use of meaningless methods.
* DIP: We demonstrated Dependecy Inversion by having classes call on eachother in hierarchy.

---

### Design Patterns 
* Factory: We demonstrate Factory through our linear hierarchy of Email, User, and Email Manager classes.
* Observer: We demonstrate Observer through our Email Manageer class being the manager of most of the processes and methods of our program.
* Adapter: We make use of Adapter through our User class implementing abstract methods that are not defined in the User class but rather the Email class.
---
## Time Space Complexity
- Our timespace complexity is O(n) 


