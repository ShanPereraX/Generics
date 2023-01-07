public class Main {
    public static void main(String[] args) {
        IntegerClass integerInstance = new IntegerClass(10);
        integerInstance.print();

        DoubleClass doubleInstance = new DoubleClass(25.5);
        doubleInstance.print();

        BooleanClass booleanInstance = new BooleanClass(true);
        booleanInstance.print();
    }
}