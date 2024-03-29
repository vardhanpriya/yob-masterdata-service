CREATE TABLE Geolocator_Master(
    PINCODE INT(20) NOT NULL,
    BRANCHCD_1 INT(10) NOT NULL,
    BRANCHNM_1 varchar(100) NOT NULL,
    ROAD_DIST_KM1 varchar(10) DEFAULT NULL,

    BRANCHCD_2 INT(10) NOT NULL,
    BRANCHNM_2 varchar(100) NOT NULL,
    ROAD_DIST_KM2 varchar(10) DEFAULT NULL,

    BRANCHCD_3 INT(10) NOT NULL,
    BRANCHNM_3 varchar(100) NOT NULL,
    ROAD_DIST_KM3  varchar(10) DEFAULT NULL,

    BRANCHCD_4 INT(10) NOT NULL,
    BRANCHNM_4 varchar(100) NOT NULL,
    ROAD_DIST_KM4 varchar(10) DEFAULT NULL,
PRIMARY KEY (PINCODE)
);