/**
 * 
 */
package com.spaneos.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author spaneos
 *
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{
	List<Student> findAll();
	List<Student> findAllByBranch(String branch);
	List<Student> findAllByNameIgnoreCaseContaining(String name);
	List<Student> findAllByNameIgnoreCaseContaining(char i);
}
