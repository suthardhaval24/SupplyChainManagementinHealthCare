## PROJECT TITLE: SUPPLY CHAIN MANAGEMENT IN HEALTH CARE SYSTEM

* **PROJECT DESCRIPTION**:

The main objective of the project is to reduce the bottleneck in the supply chain of the HEALTH CARE SYSTEM. The idea is to add the priority to each request sent by the initiator and giving additional functionalities to the procurement team to take a decision and initiate an order by itself. 

* **IMPLEMENTATION**:

This project has been implemented using a singleton pattern with fundamental JAVA concepts such as Abstraction, Collection APIs, External libraries and SWING GUI for the user interface. 
The project also helps in understanding the concept of how to design an application with respect to an ecosystem. An ecosystem includes a list of networks, each network has a list of organizations and each organization has their respective users.

* **USE CASES**:

1. Doctor orders surgical items and drugs with the specified priority.
2. Procurement Team will process the request and send the item if it is available in the hospital inventory else will order the requested item with priority to a supplier. 
3. Supplier receives orders and it’s priority from the procurement team and will send it to the Manufacturer. If the item is available in the manufacturer inventory of the same network, the demand is fulfilled. If the item is not available in the manufacturer inventory of the same network, it will process it from the manufacturer of a  different network. 
4. The manufacturer receives orders and checks for the required stock in the warehouse. If  the manufacturer inventory has the requested items in the warehouse, it will send it to the supplier else it will send a message that the requested item is out of stock.
5. Based on the response from Manufacturer, if Manufacturer has supplied the item, Supplier will deliver the requested item to the Procurement team else if they can’t fulfill the request it will contact other manufacturers of different network.
6. After receiving an order from the Supplier, Procurement team will update the item in the hospital inventory and can process the request of the doctors.

* **JDK and IDE USED**:

1. Java 8 or higher version
2. NetBeans IDE 8.0.2

* **EXTERNAL LIBRARIES TO YOUR PROJECT**:

1. The necessary libraries are including in the project 
2. If it does not includes while cloning, Below are the list of libraries we used in our project:
	1. AbsoluteLayout
	2. db4o-8.0.184.15484-all-java5
	3. itextpdf-5.4.0
	4. jcommon-1.0.0    
	5. jfreechart-1.0.1
3. To add more libraries right click on Libraries --> Add Library or Add Jar files

* **HOW TO USE OUR PROJECT**:

1. After cloning our project make sure the libraries are added to your project. If not please go through section "ADD LIBRARIES TO YOUR PROJECT".
2. Clean and build the project.
3. Run the project
4. First login credentials are as follows: (You can change it from configureSystem class of Business Package) 
	a) Username: bruteforce1@gmail.com
	b) Password: Bruteforce1$
5. Create Network as Boston, Miami and add to the list.
6. Create Employee for each network and they will the admin for accessing each network. Manager User will create credentials for the admin with respect to network.
7. Login using the admin credentials and create organisation by using the combo box in the frame.
8. Create credentials for each organisation and you can login using that credentials.
9. Add username as a valid email id of your's in procurement organization which will send a emaill notification to your email. 
10. PDF will be generated inside project folder only.
11. The show Graph will demnostrate the use case of bargraph.  

* **KNOWN ISSUE**:

TO generate the new instance of Ecosystem, you need to delete the db4o file.

* **AUTHORS**:

1. Dhaval Suthar 
2. [Krina Thakkar](https://github.com/KrinaThakkar)
3. Ronak Parakhiya
