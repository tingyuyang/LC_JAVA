#SQL Practice
* the "*" sign is always before FROM
* FROM is the table name
```SQL
SELECT * FROM Customers;
```
* WHERE operator(The WHERE clause is used to filter records.)
```SQL
SELECT * FROM Customers
WHERE Country="Mexico";
```
* If only wanna the result display specific Column
 * Display CustomerName and Address only
```SQL
SELECT CustomerName, Address FROM Customers
WHERE Country="Mexico";
```
* AND/OR operator
```SQL
SELECT * FROM Customers
WHERE Country="Germany"
AND City = "Berlin";

SELECT * FROM Customers
WHERE Country="Germany"
AND City = "Berlin" OR City = "Mannheim";
```
* Order (ASC/DESC)
```SQL
SELECT * FROM Customers
ORDER BY Country DESC;

SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;
```
* UPDATE(after update, you need the "SELECT" equation to check the new table )
```SQL
UPDATE Customers
SET City="New York" 
WHERE CustomerID = "1";

UPDATE Customers
SET City="New York", Country = "America"
WHERE CustomerID = "1";
```
* DELETE
  * The equation below delete all the rows (where Country = "Mexico")
```SQL
DELETE FROM Customers
WHERE Country = "Mexico";
```
* TOP (top50 v.s. top50%)
```SQL
SELECT TOP 50 PERCENT * FROM Customers;

SELECT TOP 50 * FROM Customers;
```

