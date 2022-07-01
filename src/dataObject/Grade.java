package dataObject;

import enumObject.GradeValueEnum;

public class Grade {

  private final String id;
  private final GradeValueEnum value;
  private final String studentId;
  private final String teacherId;

  private String dateTime;
  private boolean isUpdated = false;


  public Grade(String idArg, GradeValueEnum valueArg, String dateTimeArg, String studentIdArg, String teacherIdArg) {
    this.dateTime = dateTimeArg;
    this.id = idArg;
    this.studentId = studentIdArg;
    this.teacherId = teacherIdArg;
    this.value = valueArg;
  }


  public String getId() {
    return id;
  }

  public GradeValueEnum getValue() {
    return value;
  }

  public String getStudentId() {
    return studentId;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public boolean isUpdated() {
    return isUpdated;
  }

  public void setUpdated(boolean updated) {
    isUpdated = updated;
  }
}
