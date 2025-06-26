-- Create Customers table
CREATE TABLE Customers (
  CustomerID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  Age NUMBER,
  Balance NUMBER,
  IsVIP VARCHAR2(5)
);
/

-- Create Loans table
CREATE TABLE Loans (
  LoanID NUMBER PRIMARY KEY,
  CustomerID NUMBER,
  InterestRate NUMBER(5,2),
  DueDate DATE,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
/

-- Insert sample customers
INSERT INTO Customers VALUES (1, 'Alice', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Bob', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Charlie', 70, 20000, 'FALSE');
INSERT INTO Customers VALUES (4, 'David', 30, 9500, 'FALSE');
/

-- Insert sample loans
INSERT INTO Loans VALUES (101, 1, 7.5, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 6.0, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 8.0, SYSDATE + 5);
INSERT INTO Loans VALUES (104, 4, 9.0, SYSDATE + 25);
/

COMMIT;
Select * from customers;
 

 


BEGIN
  FOR cust IN (SELECT CustomerID FROM Customers WHERE Age > 60) LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- View updated loan interest rates
SELECT * FROM Loans;
 


BEGIN
  FOR cust IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- View updated VIP status
SELECT * FROM Customers;


BEGIN
  FOR loan_rec IN (
    SELECT L.LoanID, L.CustomerID, C.Name, L.DueDate
    FROM Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    WHERE L.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID ||
                         ' for Customer ' || loan_rec.Name ||
                         ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
