public class CommonClass <T>{
    T object;
    CommonClass(T object){
        this.object = object;
    }
    void print(){
        System.out.println(object);
    }
}
