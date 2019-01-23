package concepts;

public class Stack {
    Node top;

    public static void main(String[] args) {
        int choice;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Creating A Stack using Linked List");
//        System.out.println(" Press 1 to create a new element in the stack");
//        System.out.println(" Press 2 to delete an element in the stack");
//        System.out.println(" Press 3 to display stack");
//        choice = scanner.nextInt();
//        System.out.println("Eneter you choice", +choice);
//        choice = scanner.nextInt();


    }

    /**
     * Display the top element using peek()
     * @return Node
     */
    public Node peek(){


        if(top != null ){
            return top;
        }
        else
            return null;


    }

    public Node pop(){
        if(top == null){
            return null;
        }
        else {
            Node temp = new Node(top.val);
            top =top.next;
            return temp;

        }
    }

    public void push(Node n){
        if(n != null){
            n.next = top;
            top = n;
        }
    }


}
