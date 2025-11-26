// This file contains JavaScript code for client-side functionality. 

document.addEventListener('DOMContentLoaded', function() {
    // Function to fetch and display all students
    function fetchStudents() {
        fetch('/students')
            .then(response => response.json())
            .then(data => {
                const studentList = document.getElementById('student-list');
                studentList.innerHTML = '';
                data.forEach(student => {
                    const listItem = document.createElement('li');
                    listItem.textContent = `${student.name} (ID: ${student.id}, Age: ${student.age})`;
                    studentList.appendChild(listItem);
                });
            })
            .catch(error => console.error('Error fetching students:', error));
    }

    // Fetch students on page load
    fetchStudents();
});