#SQL Practice
* FROM is the table name
```SQL
SELECT * FROM Customers
```
* WHERE operator(The WHERE clause is used to filter records.)
```SQL
SELECT * FROM Customers
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
* UPDATE
```SQL
UPDATE Customers
SET City="New York" AND Country ="America"
WHERE CustomerID = "1"
```
