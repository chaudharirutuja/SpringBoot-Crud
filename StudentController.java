package com.Springboot.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Model.Student;



@RestController
public class StudentController {
	
	@Autowired
	SessionFactory sf;
	
	
	@PostMapping("insertRecord")
	public Session insertRecord(@RequestBody Student student) {
		Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(student); // dataBase
        tx.commit();
		System.out.println(ss);
		return ss ;
	}
		
		@PutMapping("updateRecord")
		public Session updateRecord(@RequestBody Student student) {
			Session ss = sf.openSession();

			Transaction tx = ss.beginTransaction();

			
			ss.update(student);
			tx.commit();
			System.out.println(ss);
			return ss;

		}
		@DeleteMapping("deleteRecord/{id}")
		public Session deleteRecord(@PathVariable int id) {
			Session ss = sf.openSession();

			Transaction tx = ss.beginTransaction();

			
			ss.delete(id);
			tx.commit();
			System.out.println(ss);
			return ss;

		}
		@GetMapping("multipleRecord")
		public List showMultiplData() {

			Session ss = sf.openSession();
			String hql = "from Student"; // tableName
			Query query = ss.createQuery(hql);
			List results = query.list();

			System.out.println(results);
			return results;
		}

}
