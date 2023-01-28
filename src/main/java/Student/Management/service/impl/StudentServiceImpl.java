package Student.Management.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import Student.Management.entity.Student;
import Student.Management.repository.StudentRepository;
import Student.Management.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
         
	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		//TODO Auto-generated method stub;
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}

