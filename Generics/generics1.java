package Generics;

class BoundedGenericClass< T extends Number> {
    private T data;

    public BoundedGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data){
        this.data=data;
    }
}

public class generics1 {
    public static void main(String[] args) {
        BoundedGenericClass<Integer> intobj = new BoundedGenericClass<>(4);
        intobj.setData(20);
        System.out.println(intobj.getData());
    }

}
