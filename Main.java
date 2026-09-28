public class Main {
    public static void main(String[] args) {
        Student student = new Student("Manju", 20);
        student.display();
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Multiplication: " + calculator.multiply(5, 4));
    }
}