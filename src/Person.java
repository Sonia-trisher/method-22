public class Person {

    private String name;
    private int weight;
    private int height;
    private double bmi;
    private String bmiStatus;

    public Person() {
        // Default constructor
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {

        return weight;
    }
    public int getHeight() {

        return height;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void calculateBmi() {
        this.bmi = (double) weight / (height * height) * 10000;
    }

    public double getBmi() {
        return bmi;
    }

    public void generateBmiStatus() {
        if (bmi < 18.5) {
            this.bmiStatus = "Underweight";
        } else if (bmi < 25) {
            this.bmiStatus = "Normal";
        } else {
            this.bmiStatus = "Overweight";
        }
    }

    public String getBmiStatus() {
        return bmiStatus;
    }

    public String toString() {
        return name+" with weight=" + weight + " kg and height=" + height + " cm has BMI=" + bmi + ", This person is " +bmiStatus+"";
    }
}
