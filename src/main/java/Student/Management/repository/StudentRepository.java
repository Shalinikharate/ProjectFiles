package Student.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.Management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
         
}
