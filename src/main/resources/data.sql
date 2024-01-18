--inserting the makes data
INSERT INTO MAKES VALUES(1, 'BMW');
INSERT INTO MAKES VALUES(2, 'JAGUAR');
--inserting the garages data
INSERT INTO GARAGES VALUES(1,3,'CLARK STREET');
INSERT INTO GARAGES VALUES(2,2,'GREEN ST');
--inserting sample user
INSERT INTO USERS VALUES(1,'rahul@gmail.com','rahul','mohan','rahul1234');
INSERT INTO USERS VALUES(2,'r@g.com','rahul','mohan','rahul1234');
--inserting alraedy registered vehicles
INSERT INTO VEHICLES (make_Id, license_Plate, color, user_Id) VALUES (1,'ABS','RED',2);
