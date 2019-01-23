package concepts;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<>();

        //adding Linkedlist
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add("E");
        System.out.println("Linked List is: "+object);

        //removing linked list
        object.remove("B");
        object.remove("C");
        object.remove("B");
        object.removeFirst();
        System.out.println("Linked List after removing elements: "+object);

        //checking if linked list consists of an element
        boolean status = object.contains("A");
        if(status)
            System.out.println("A is in the list");
        else
            System.out.println("Not in the list");

        // size of the linked list
        int size = object.size();
        System.out.println("Size of the linkedlist: "+size);

        //get and set elements
        Object element = object.get(1);
        System.out.println("Element "+element);

        object.set(0,"Q");
        System.out.println(object);
    }
}
