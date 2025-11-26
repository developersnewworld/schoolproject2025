package com.school.service;

import com.school.model.Student;
import com.school.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    // Compatibility methods for Controller which expects findAll/findById
    public List<Student> findAll() {
        return getAllStudents();
    }

    public Student findById(Long id) {
        return getStudentById(id);
    }
}