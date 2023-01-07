public class NumericalClass <T extends Number, V extends Number>{
//    Integer object1;
//    Integer object2;

    //compatible with Numbers
    T object1;
    V object2;
    public NumericalClass(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    double calculation(){
        return object1.doubleValue() + object2.doubleValue();
    }
}
