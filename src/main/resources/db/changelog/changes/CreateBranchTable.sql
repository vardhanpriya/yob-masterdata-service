CREATE TABLE Branch_Master(

    ID int(20) AUTO_INCREMENT PRIMARY KEY,
    CITY varchar(50) DEFAULT NULL,
    STATE varchar(50) DEFAULT NULL,
    BRANCH_CODE varchar(10) DEFAULT NULL,
    BRANCH_NAME varchar(50) DEFAULT NULL,
    IFSC_CODE varchar(10) DEFAULT NULL,
    BANKING_TYPE varchar(10) DEFAULT NULL,
    BRANCH_ADDRESS_LINE_1  varchar(40) DEFAULT NULL,
    BRANCH_ADDRESS_LINE_2  varchar(40) DEFAULT NULL,
    BRANCH_ADDRESS_LINE_3  varchar(40) DEFAULT NULL,
    REGION varchar(20) DEFAULT NULL,
    IS_ACTIVE INT(1) DEFAULT 1
);