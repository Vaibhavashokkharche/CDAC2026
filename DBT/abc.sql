DROP FUNCTION IF EXISTS paybill;

DELIMITER $

CREATE FUNCTION paybill(p_id INT)
RETURNS INT
DETERMINISTIC
BEGIN 
    DECLARE total INT;
    
    -- Using SUM() prevents errors if one patient has multiple treatment rows
    SELECT SUM(doctor_fee + medical_fee) INTO total 
    FROM treatment 
    WHERE patient_id = p_id;
    
    -- If no record is found, return 0 instead of NULL
    RETURN IFNULL(total, 0);
END $

DELIMITER ;









