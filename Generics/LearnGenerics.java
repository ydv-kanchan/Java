package Generics;

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class LearnGenerics{

public static void main(String[] args) {
    GenericClass<Integer> intobj = new GenericClass<>(10);
    System.out.println(intobj.getData());
    intobj.setData(500);
    System.out.println(intobj.getData());

    GenericClass<String> stringobj = new GenericClass<>("hello");
    System.out.println(stringobj.getData());
    }
}
