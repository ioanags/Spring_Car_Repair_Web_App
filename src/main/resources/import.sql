INSERT INTO Person (firstname, lastname,Address,Email,Password,Plate,Carmodel,Type,Afm) VALUES ('Panos', 'Makris','28is oktobriou','panosmak37@gmail.com','$2a$10$mSx26NRP/ESg08nT8ZbW8..U7R9GHvt.cNgTVmXlYKOlFUjDC.OUy','AVC-1234','Toyota','Admin','224824');
INSERT INTO Person (firstname, lastname,Address,Email,Password,Plate,Carmodel,Type,Afm) VALUES ('Giannis', 'Agathos','Gr. Zogkou 42','giannisags@gmail.com','$2a$10$ml0FR8wPCgI6uHlTwyVSTuNCC9Whz/0NGTjfdGtgnxrT/sOl1kCea','PZH-1234','Toyota','Admin','1020305040');
INSERT INTO Person (firstname, lastname,Address,Email,Password,Plate,Carmodel,Type,Afm) VALUES ('Asterios', 'Haritos','Davaki 32','asterios@gmail.com','$2a$10$dAxj8R1aZ9b/ylBOLfSrTOId2gOuuERHqV3xOpuik0I1buZOzYyX6','INK-1234','Toyota','User','894562');

INSERT INTO Repairs (Date, Kind,Cost,Description,person_id,Status) VALUES ('2019-05-01 15:15:00', 'Small','150','A lot of work','1','Append');
INSERT INTO Repairs (Date, Kind,Cost,Description,person_id,Status) VALUES ('2019-12-25 13:10:00', 'Small','400','They were eaten','2','Append');
INSERT INTO Repairs (Date, Kind,Cost,Description,person_id,Status) VALUES ('2020-10-09 10:15:00', 'Big','200','A lot of work','1','Ready');

