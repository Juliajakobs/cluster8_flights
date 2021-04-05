CREATE TABLE IF NOT EXISTS flights(
  airline VARCHAR(128)not null,
  flightNo VARCHAR(128)not null PRIMARY KEY,
  departureTime DATETIME not null,
  arrivalTime DATETIME not null,
  departureDest VARCHAR(128)not null,
  arrivalDest VARCHAR(128)not null,
  airport VARCHAR(128)not null,
  price INTEGER not null,
);

CREATE TABLE IF NOT EXISTS passenger(
    firstName VARCHAR(128) not null,
    lastName VARCHAR(128) not null,
    passportNo VARCHAR(36)  not null,
    nationalID INTEGER (10) not null PRIMARY KEY,
    address VARCHAR (128) not null,
    email VARCHAR(128) not null,
    telNo VARCHAR (16) not null,
);

CREATE TABLE IF NOT EXISTS bookings(
    bookingNo VARCHAR(36) not null,
    seatNo VARCHAR(6) not null,
    bagsNo INTEGER not null,
    meal boolean,
    flightNo VARCHAR(128) not null,
    nationalID INTEGER(10) not null,
    FOREIGN KEY flightNo REFERENCES flights(flightNo),
    FOREIGN KEY nationalID REFERENCES passenger(nationalID),
);
