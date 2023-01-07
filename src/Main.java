public class Main {
    public static void main(String[] args) {
    /*    IntegerClass integerInstance = new IntegerClass(10);
        integerInstance.print();
        DoubleClass doubleInstance = new DoubleClass(25.5);
        doubleInstance.print();
        BooleanClass booleanInstance = new BooleanClass(true);
        booleanInstance.print();
    */

        //Generics -> JDK 1.5
    /*
        CommonClass<Integer> integerCommonInstance = new CommonClass<Integer>(10);
        integerCommonInstance.print();

        CommonClass<Double> doubleCommonInstance = new CommonClass<Double>(25.5);
        doubleCommonInstance.print();
    */

      //  after JDK 1.7 does not need to specify type
    /*  CommonClass booleanCommonInstance = new CommonClass(true);
        booleanCommonInstance.print();
        NumericalClass numericalClass = new NumericalClass(10, 20);
        System.out.println(numericalClass.calculation());
    */

      // NumericalClass numericalClassInstance1 = new NumericalClass(45,50.0); //error(Parameters of constructor does not match) ->
      // We can use Generics for solve this issue.
    /*
        NumericalClass<Integer, Integer> numericalClassInstance3 = new NumericalClass<Integer,Integer>(10,10);
        System.out.println(numericalClassInstance3.calculation());
        NumericalClass<Integer, Double> numericalClassInstance4 = new NumericalClass<Integer,Double>(10,11.1);
        System.out.println(numericalClassInstance4.calculation());
        NumericalClass<Integer, Byte> numericalClassInstance5 = new NumericalClass<Integer,Byte>(10,(byte)12);
        System.out.println(numericalClassInstance5.calculation());
    */

      //Error(compile time type safety)
    /*
        NumericalClass<Double, String> numericalClassInstance6 = new NumericalClass<>(10.5, "Nimal");
        System.out.println(numericalClassInstance6.calculation());
         */
    }
}