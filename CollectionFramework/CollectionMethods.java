package CollectionFramework;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Element1");
        collection.add("Element2");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection.add("Element3"));
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.remove("Element1"));
        System.out.println(collection.size());
        System.out.println(collection.contains("Element2"));
        System.out.println(collection.contains("Element1"));
        System.out.println(collection);
    }

}
