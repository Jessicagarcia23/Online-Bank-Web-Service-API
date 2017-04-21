DROP DATABASE IF EXISTS BankingSystem;

CREATE DATABASE BankingSystem;

USE BankingSystem;

CREATE TABLE SecurityQuest(
Id_SecurityQuest int NOT NULL AUTO_INCREMENT,
Desc_SecurityQuest  VARCHAR (50) NOT NULL,
PRIMARY KEY (Id_SecurityQuest));


CREATE TABLE Customers(
Id_Customer int NOT NULL AUTO_INCREMENT,
Name_Customer VARCHAR(50) NOT NULL,
Address_Customer VARCHAR(50) NOT NULL,
Email_Customer VARCHAR(50) NOT NULL,
Phone_Customer VARCHAR(50) NOT NULL,
Password_Customer VARCHAR(50)NOT NULL,
Id_SecurityQuest int NOT NULL,
Answer_Quest VARCHAR (50)NOT NULL,
PRIMARY KEY (Id_Customer),
FOREIGN KEY (Id_SecurityQuest) references SecurityQuest(Id_SecurityQuest)

);

CREATE TABLE Transactions(
Id_Transaction int NOT NULL AUTO_INCREMENT,
Desc_Transaction VARCHAR(50) NOT NULL,
PRIMARY KEY (Id_Transaction)
);

CREATE TABLE TypeAccount(
Id_TypeAccount int NOT NULL AUTO_INCREMENT,
Desc_TypeAccount VARCHAR(50) NOT NULL,
PRIMARY KEY (Id_TypeAccount)
);

CREATE TABLE Accounts(
Id_Account int NOT NULL AUTO_INCREMENT,
Balance_Account DECIMAL(7,2) NOT NULL,
Id_TypeAccount int NOT NULL,
Id_Customer int NOT NULL,
PRIMARY KEY (Id_Account),
FOREIGN KEY (Id_TypeAccount) REFERENCES TypeAccount(Id_TypeAccount),
FOREIGN KEY (Id_Customer) REFERENCES Customers(Id_Customer)
);


CREATE TABLE TransCustom(
Id_TransCustom int NOT NULL AUTO_INCREMENT,
Id_Transaction int NOT NULL,
Id_Account int NOT NULL,
PRIMARY KEY (Id_TransCustom),
FOREIGN KEY (Id_Transaction) REFERENCES Transactions(Id_Transaction),
FOREIGN KEY (Id_Account) REFERENCES Accounts(Id_Account)
);


insert into BankingSystem.TypeAccount(Desc_TypeAccount) values ( 'Current');
insert into BankingSystem.TypeAccount(Desc_TypeAccount) values ( 'Savings');
insert into BankingSystem.Transactions(Desc_Transaction) values ( 'Transfer');
insert into BankingSystem.Transactions(Desc_Transaction) values ( 'Lodgment');
insert into BankingSystem.Transactions(Desc_Transaction) values ( 'Withdrawal');


