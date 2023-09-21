/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ST10375530_SectionA;

/**
 *
 * @author lab_services_student
 */
import st10375530_sectiona.student;
import st10375530_sectiona.ST10375530_SectionA;
import static org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentTest {

    @Test
    void testSaveStudent() {
        student student = new student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");

        assertEquals(10111, student.getId());
        assertEquals("J.Bloggs", student.getName());
        assertEquals(19, student.getAge());
        assertEquals("jbloggs@ymail.com", student.getEmail());
        assertEquals("disd", student.getCourse());
    }

    @Test
    void testSearchStudent() {
        // Assuming students is a List<Student> containing the test student
        List<Student> students = new ArrayList<>();
        students.add(new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd"));

        Student foundStudent = students.stream()
                .filter(s -> s.getId() == 10111)
                .findFirst()
                .orElse(null);
        assertNotNull(foundStudent);
        assertEquals(10111, foundStudent.getId());
    }

    @Test
    void testSearchStudent_StudentNotFound() {
        // Assuming students is an empty List<Student>
        List<Student> students = new ArrayList<>();

        Student foundStudent = students.stream()
                .filter(s -> s.getId() == 55555)
                .findFirst()
                .orElse(null);
        assertNull(foundStudent);
    }

    @Test
    void testDeleteStudent() {
        // Assuming students is a List<Student> containing the test student
        List<Student> students = new ArrayList<>();
        students.add(new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd"));

        boolean deleted = students.removeIf(s -> s.getId() == 10111);
        assertTrue(deleted);

        Student foundStudent = students.stream()
                .filter(s -> s.getId() == 10111)
                .findFirst()
                .orElse(null);
        assertNull(foundStudent);
    }

    @Test
    void testDeleteStudent_StudentNotFound() {
        // Assuming students is an empty List<Student>
        List<Student> students = new ArrayList<>();

        boolean deleted = students.removeIf(s -> s.getId() == 55555);
        assertFalse(deleted);
    }
}
