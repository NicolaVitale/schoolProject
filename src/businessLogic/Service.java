package businessLogic;

import dataObject.Grade;
import dataObject.Lesson;
import dataObject.Student;
import dataObject.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Service {

  private Map<String, Grade> grades;
  private Map<String, Lesson> lessons;
  private Map<String, Student> students;
  private Map<String, Teacher> teachers;

  public Optional<Teacher> findTeacherById(String teacherId) {
    Optional<Teacher> optionalTeacher = Optional.ofNullable(teachers.get(teacherId));
    if(optionalTeacher.isPresent()) {
      List<Lesson> lessons = findLessonByTeacherId(teacherId);
    }
  }

  public List<Lesson> findLessonByTeacherId(String teacherId) {
    List<Lesson> teacherLessons = new ArrayList<>();
    lessons.forEach((k, v) -> {
      if (v.getTeacherId().equals(teacherId)) {
        teacherLessons.add(v);
      }
    });

    for(Lesson lesson : lessons.values()){  //.values prende il valore dalla map e esclude la chiave
      if (lesson.getTeacherId().equals(teacherId)) {
        teacherLessons.add(lesson);
      }
    }
    return teacherLessons;
  }


}
