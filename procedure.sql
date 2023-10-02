DELIMITER $$

CREATE PROCEDURE SearchTutorialsByTitle(IN searchTitle VARCHAR(255))
BEGIN
    SELECT * FROM testdb.tutorials WHERE title LIKE CONCAT('%', searchTitle, '%');
END$$

DELIMITER ;
