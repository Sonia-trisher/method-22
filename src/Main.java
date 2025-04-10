public class Main {
    public static void main(String[] args) {
        // Adding new Students
        Student student1 = new Student();
        student1.setId("1");
        student1.setFullName("John Doe");
        student1.setRegistrationNumber("REG123");
        // String std1Id = student1.getId();
        // String std1FullName = student1.getFullName();
        // String std1RegNumber = student1.getRegistrationNumber();
        System.out.println(student1.getFullName());
        System.out.println(student1.getRegistrationNumber());
        System.out.println(student1.getId());
        // System.out.println(student1.marks);
        // student1.marks = 25;
        // System.out.println(student1.marks);

        // Adding another Student
        Student student2 = new Student();
        student2.setId("2");
        student2.setFullName("Jane Smith");
        student2.setRegistrationNumber("REG456");


        // Printing Student details
        // System.out.println(student1.toString());
        // System.out.println(student2.toString());

        // BMI Calculator
        Person person1 = new Person("Ndayishimiye Evodie", 68, 167);
        Person person2 = new Person("Munezero Aline", 68, 178);
        Person person3 = new Person(179, 68);

        person1.calculateBmi();
        person1.generateBmiStatus();
        System.out.println(person1.toString());

        person2.calculateBmi();
        person2.generateBmiStatus();
        System.out.println(person2.toString());

        // if (person1.getHeight() > person2.getHeight()) {
        //     System.out.println(person1.getName() + " is taller than " + person2.getName());
        // } else {
        //     System.out.println(person2.getName() + " is taller than " + person1.getName());
        // }
    }
}
