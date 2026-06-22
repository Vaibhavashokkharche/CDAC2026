delimiter //
create procedure getempbyid(In id INT)
BEGIN
select * from emp where empno=id;
END //
delimiter ;