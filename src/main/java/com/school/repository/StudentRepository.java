package com.school.repository;

import com.school.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    // Method to find all students
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    // Method to find a student by ID
    public Student findById(Long id) {
        Optional<Student> student = students.stream().filter(s -> s.getId() != null && s.getId().equals(id)).findFirst();
        return student.orElse(null);
    }

    // Save or update a student
    public void save(Student student) {
        if (student.getId() == null) {
            long newId = students.size() + 1;
            student.setId(newId);
            students.add(student);
        } else {
            // find and replace
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId().equals(student.getId())) {
                    students.set(i, student);
                    return;
                }
            }
            students.add(student);
        }
    }

    // Delete a student by ID
    public void deleteById(Long id) {
        students.removeIf(s -> s.getId() != null && s.getId().equals(id));
    }
}