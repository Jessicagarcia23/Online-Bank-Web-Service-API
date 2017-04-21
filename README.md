# Online-Bank-Web-Service-API
NATIONAL COLLEGE OF IRELAND - H. DIPLOMA IN CLOUD COMPUTING
Web Services and API Development CA3 Project
Lecturer Julie Power

Authors: 
        
         Jessica Garcia  [jessicarolinagarciamartinuzzi@gmail.com]
        
         
          Fernanda Carvalho [fernandafcr@gmail.com]
        
         
          Franciele  [franciele.karine@hotmail.com]
        
         

Screenshots and description: http://hackwhiz.com/2015/02/online-banking-system-php-mysql/ 

The project’s Main goal is based on:

> A Clean and effective web based online banking system.

>Personal banking services that gives you complete control over all your banking demands online.

>Simple and easy user interface to work with.

Online Banking features:

>Registration for online banking by Admin.

>Adding Beneficiary account by customer.

>Transferring amount to the beneficiary added by customer.

>Staff must approve for beneficiary activation before it can be used for transferring funds.

>Customer can check last transactions made with their account.

>Customer can check their account statement within a date range.

>Admin can add/edit/delete customer as well as staff.

>All three of them(customer, staff & admin) can change their password.

>Staff and Admin Login pages are hidden from customer for security purpose.



Database:

>The database contains customers, securityQuest, Transactions,TypeAccount, Accounts,TransCustom.

>Each customer has its own virtual passbook linked with its account number.






This project is divided into three hierarchical parts: 

>The index page for the customer login.

>A hidden staff login page.

>A hidden admin login page.

Usage:

1.Install XAMPP or something similar.

2.Copy all the files to c:/xampp/htdocs/banking/

3.Create a db named as 'bnak_db' and import the bank_db.sql from phpMyAdmin.

4.change the password in _inc/dbconn.php file accordingly.

5.visit localhost/banking (customer index page)

6.visit localhost/banking/adminlogin.php (admin login)

7.visit localhost/banking/staff_login.php (staff login)

Note: The customer passwords are hashed and stored in the database. You will not be able to see it.
The password is 'rash' for almost all the customers,just in case if you want to login with the pre added customer. 


