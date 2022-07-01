package dataObject;

public class Teacher {

  // DECLARATION
  private final String id;
  private final String name;
  private final String surname;
  private final String birthDate;

  // CONSTRUCTOR
  public Teacher(String idArg, String nameArg, String surnameArg, String birthDateArg) {
    this.id = idArg;
    this.name = nameArg;
    this.surname = surnameArg;
    this.birthDate = birthDateArg;
  }


  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getBirthDate() {
    return birthDate;
  }
}
