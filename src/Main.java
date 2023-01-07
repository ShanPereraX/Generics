public class Main {
    public static void main(String[] args) {
//        IntegerClass integerInstance = new IntegerClass(10);
//        integerInstance.print();
//
//        DoubleClass doubleInstance = new DoubleClass(25.5);
//        doubleInstance.print();
//
//        BooleanClass booleanInstance = new BooleanClass(true);
//        booleanInstance.print();

        //Generics -> JDK 1.5

        CommonClass<Integer> integerCommonInstance = new CommonClass<Integer>(10);
        integerCommonInstance.print();

        CommonClass<Double> doubleCommonInstance = new CommonClass<Double>(25.5);
        doubleCommonInstance.print();

        //after JDK 1.7 does not need to specify type
        CommonClass booleanCommonInstance = new CommonClass(true);
        booleanCommonInstance.print();
    }
}