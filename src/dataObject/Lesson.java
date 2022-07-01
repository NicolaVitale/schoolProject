package dataObject;

import enumObject.SubjectTypeEnum;
import java.util.List;

public class Lesson {

  private final String id;
  private final String dateTimeEnd;
  private final String dateTimeStart;
  private final SubjectTypeEnum subjectTypeEnum;
  private final String classId;
  private final List<String> students;
  private final String teacherId;

  public Lesson(String id, String dateTimeEnd, String dateTimeStart,
      SubjectTypeEnum subjectTypeEnum, String classId,
      String studentI, List<String> students, String teacherId) {
    this.id = id;
    this.dateTimeEnd = dateTimeEnd;
    this.dateTimeStart = dateTimeStart;
    this.subjectTypeEnum = subjectTypeEnum;
    this.classId = classId;
    this.students = students;
    this.teacherId = teacherId;
  }

  public String getId() {
    return id;
  }

  public String getDateTimeEnd() {
    return dateTimeEnd;
  }

  public String getDateTimeStart() {
    return dateTimeStart;
  }

  public SubjectTypeEnum getSubjectTypeEnum() {
    return subjectTypeEnum;
  }

  public String getClassId() {
    return classId;
  }

  public List<String> getStudents() {
    return students;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public boolean isStudentAttending(String studentId) {
    return students.contains(studentId);
  }
}