package Generics;

//generic class to take input from user of different types
class Input<Z> {
    private Z typeData;

    //assign value by constructor
    public Input(Z typeData) {
        this.typeData = typeData;
    }
    // get value by method (generic method)
    public Z getData() {
        return typeData;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        //take input from user for different types for the same class
        Input<String> strobj = new Input<>("This is my Java result out of 100: ");
        Input<Integer> intobj = new Input<>(80);
        System.out.println(strobj.getData() + " " + intobj.getData());
    } 
}
