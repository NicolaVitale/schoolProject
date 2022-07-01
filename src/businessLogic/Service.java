package businessLogic;

import dataObject.Grade;
import dataObject.Lesson;
import dataObject.Student;
import dataObject.StudentRelation;
import dataObject.Teacher;
import dataObject.TeacherRelation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Service {

  private Map<String, Grade> grades;
  private Map<String, Lesson> lessons;
  private Map<String, Student> students;
  private Map<String, Teacher> teachers;

  public Optional<TeacherRelation> findTeacherById(String teacherId) {
    Optional<Teacher> optionalTeacher = Optional.ofNullable(teachers.get(teacherId));
    if(optionalTeacher.isPresent()) {
      List<Lesson> teacherLessons = findLessonByTeacherId(teacherId);
      TeacherRelation teacherRelation = new TeacherRelation(optionalTeacher.get());
      return Optional.of(teacherRelation);
    } else {
      return Optional.empty();
    }
  }

  public List<Lesson> findLessonByTeacherId(String teacherId) {
    List<Lesson> teacherLessons = new ArrayList<>();

    /*lessons.forEach((k, v) -> {
      if (v.getTeacherId().equals(teacherId)) {
        teacherLessons.add(v);
      }
    });*/

    for(Lesson lesson : lessons.values()){  //.values prende il valore dalla map e esclude la chiave
      if (lesson.getTeacherId().equals(teacherId)) {
        teacherLessons.add(lesson);
      }
    }
    return teacherLessons;
  }

  public Optional<StudentRelation> findStudentById (String studentId) {
    Optional<Student> optionalStudent = Optional.ofNullable(students.get(studentId));
    if (optionalStudent.isPresent()) {
      List<Lesson> studentLessons = findLessonByStudentId(studentId);
      StudentRelation studentRelation = new StudentRelation(optionalStudent.get());
      return Optional.of(studentRelation);
    } else {
      return Optional.empty();
    }
  }

  public List<Lesson> findLessonByStudentId(String studentId) {
    List<Lesson> studentLessons = new ArrayList<>();
    for (Lesson lesson : lessons.values()) {
      if (lesson.isStudentAttending(studentId)) {
        studentLessons.add(lesson);
      }
    }
    return studentLessons;
  }

}
