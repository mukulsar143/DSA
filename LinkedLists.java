
import java.util.*;

// class LL{
//     Node head;
//     private int size;
//     LL(){
//         this.size = 0;
//     }
//     class Node {
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null){
//              currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }
//     public void printLL(){
//         if(head == null){
//             System.out.println("List is Empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + "->");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     public void deleteFirst(){
//         if(head == null){
//             System.out.print("LL is Empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }
//     public void deleteLast(){
//         if(head == null){
//             System.out.println("LL is empty");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }
//     public int getLLSize(){
//         return size;
//     }
//     public static void main(String args[]){
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.printLL();
//         list.addLast("Link");
//         list.printLL();
//         list.addLast("List");
//         list.printLL();
//         list.addFirst("This");
//         list.printLL();
//         System.out.println("Size of: "+ list.getLLSize());
//         list.deleteFirst();
//         list.printLL();
//         list.deleteLast();
//         list.printLL();
//         System.out.println("Size of: "+ list.getLLSize());
//     }
// }
// For Collections Framework
class LL {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Google");
        list.addFirst("at");
        list.addFirst("job");
        list.addFirst("a");
        list.addFirst("got");
        System.out.print(list);
        System.out.println();
        list.addFirst("I");
        list.addLast("very");
        list.addLast("soon");
        System.out.print(list);
        System.out.println();
        list.add("Watch!!");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            // if search
            if (list.get(i) == "Google") {
                System.out.print(list.get(i));
            }
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        // remove by id
        list.remove(3);
        System.out.println(list);
    }
}
