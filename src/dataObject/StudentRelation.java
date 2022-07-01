package dataObject;

import java.util.List;

public class StudentRelation extends Student{

  private List<Lesson> lessons;

  public StudentRelation(Student student) {
    super(
        student.getId(),
        student.getName(),
        student.getSurname(),
        student.getBirthDate()
    );
  }

  public StudentRelation (Student student, List<Lesson> lessons) {
    this(student);
    this.lessons = lessons;
  }

  public List<Lesson> getLessons() {
    return lessons;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }
}
