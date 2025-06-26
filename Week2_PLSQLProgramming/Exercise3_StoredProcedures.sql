

-- Create Accounts table
CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  CustomerName VARCHAR2(100),
  AccountType VARCHAR2(20),
  Balance NUMBER
);
/

-- Create Employees table
CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  Department VARCHAR2(50),
  Salary NUMBER
);
/

-- Insert sample accounts
INSERT INTO Accounts VALUES (1, 'Alice', 'Savings', 10000);
INSERT INTO Accounts VALUES (2, 'Bob', 'Savings', 15000);
INSERT INTO Accounts VALUES (3, 'Charlie', 'Current', 20000);
INSERT INTO Accounts VALUES (4, 'David', 'Savings', 8000);
/

-- Insert sample employees
INSERT INTO Employees VALUES (101, 'John', 'HR', 50000);
INSERT INTO Employees VALUES (102, 'Jane', 'Finance', 60000);
INSERT INTO Employees VALUES (103, 'Mark', 'HR', 55000);
INSERT INTO Employees VALUES (104, 'Lucy', 'IT', 70000);
/

COMMIT;
SELECT * FROM Accounts;
SELECT * FROM Employees;

 
 

--Scenario 1: Process Monthly Interest for Savings Accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';
END ProcessMonthlyInterest;
/

-- Call the procedure
EXEC ProcessMonthlyInterest;
Select * from Accounts;

--Scenario 2: Bonus for Employees in a Department
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept_name IN VARCHAR2,
  bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_pct / 100)
  WHERE Department = dept_name;
END UpdateEmployeeBonus;
/

-- Call example: 10% bonus for HR
EXEC UpdateEmployeeBonus('HR', 10);
Select * from Employees;

 --Scenario 3: Transfer Funds Between Accounts
CREATE OR REPLACE PROCEDURE TransferFunds(
  source_id IN NUMBER,
  target_id IN NUMBER,
  amount IN NUMBER
) AS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    src_balance NUMBER;
  BEGIN
    SELECT Balance INTO src_balance FROM Accounts WHERE AccountID = source_id;

    IF src_balance < amount THEN
      RAISE insufficient_balance;
    ELSE
      UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = source_id;
      UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = target_id;
    END IF;
  END;
EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in source account.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END TransferFunds;
/

-- Enable output and call the procedure
EXEC TransferFunds(1, 2, 2000);
SELECT * FROM Accounts;


