#SQL Practice
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
