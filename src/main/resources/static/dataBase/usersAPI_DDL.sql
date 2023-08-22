CREATE DATABASE usersAPI;

DROP DATABASE users;

CREATE TABLE users (
	login VARCHAR(20) NOT NULL PRIMARY KEY,
    userpassword VARCHAR(30) NOT NULL,
    username VARCHAR(50) NOT NULL,
    clientnumber FLOAT NOT NULL,
    email VARCHAR(50),
    registrationdate DATE NOT NULL DEFAULT (CURRENT_DATE()),
    terminationdate DATE,
    clientstatus VARCHAR(10) DEFAULT 'Active'
);
    
    



