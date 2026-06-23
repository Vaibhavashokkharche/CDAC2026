package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
private JdbcTemplate jdbcTemplate;

	//step 7 : add p.setPimagefile(rs.getString(7)) in rowmapper function and the go to displayall.jsp
	@Override
	public List<Product> findAllProduct() {
		List<Product> plist=jdbcTemplate.query("select * from product", (rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			p.setPimagefile(rs.getString(7));
			return p;
		});
		
		return plist;
	}

	@Override
	public boolean saveProduct(Product p) {
		int n=jdbcTemplate.update("insert into product values(?,?,?,?,?,?,?)",new Object[]{p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid(),p.getPimagefile()});
		return n>0;
	}

	@Override
	public boolean removeById(int pid) {
		
		int n=jdbcTemplate.update("delete from product where pid=?",new Object[]{pid});
		return n>0;
	}

	@Override
	public Product findById(int pid) {
		try {
		Product p1=jdbcTemplate.queryForObject("select * from product where pid=?",new Object[] {pid}, (rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			p.setPimagefile(rs.getString(7));
			return p;
		});
		System.out.println(p1);
		return p1;
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public boolean modifyProduct(Product p) {
		int n=jdbcTemplate.update("update product set qty=?,price=?,pname=? where pid=?",new Object[]{p.getQty(),p.getPrice(),p.getPname(),p.getPid()});
		return n>0;
	}
}
