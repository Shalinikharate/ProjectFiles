package Student.Management.service;


import java.util.Collection;
import java.util.List;

import Student.Management.entity.Student;

public interface StudentService {
	Collection<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
