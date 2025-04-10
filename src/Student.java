public class Student {

    private String id;
    private String fullName;
    private String registrationNumber;
    private int age = 18;
    public double marks = 20;
    // private String Marks;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fname) {
        this.fullName = "Ms. "+fname;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String regNumber)
    {
        this.registrationNumber = regNumber;
    }

    public String toString() {
        return "Student [id=" + id + ", fullName=" + fullName + ", registrationNumber=" + registrationNumber + ", age=" + age + "]";
    }
}
