package dataObject;

import java.util.List;

public class TeacherRelation extends Teacher {

  private List<Lesson> lessons;

  public TeacherRelation(Teacher teacher) {
    super(
        teacher.getId(),
        teacher.getName(),
        teacher.getSurname(),
        teacher.getBirthDate()
    );
  }

  public TeacherRelation (Teacher teacher, List<Lesson> lessons) {
    this(teacher);
    this.lessons = lessons;
  }


  public List<Lesson> getLessons() {
    return lessons;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }
}
