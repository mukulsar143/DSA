
class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }

    public void deleteFisrt() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node last = head.next;
        Node secondLast = head;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    public void addMiddle(int idx, int data) {
        if (idx <= 0 || idx >= size) {
            System.out.println("Invalid idx");
            return;
        }
        Node newNode = new Node(data);
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 1; i < idx; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean contains(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public Node reverseLL(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node recRevLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recRevLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public Node removeNthNodefromEnd(Node head, int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        
        int idxSrc = size - n;
        Node prev = head;
        int i = 1;
        while(i < idxSrc){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public void printNthNodefromEnd(int n){
        
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        
        if(n > size || n<= 0){
            System.out.println("Invalid n");
            return;
        }
        
        int idxSrc = size - n;
        curr = head;
        for(int i = 0; i< idxSrc; i++){
            curr = curr.next;
        }
        
        System.out.println("Find nth: "+curr.data);
            
    }
    public void printNthNodefromFirst(int n){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node curr = head;
        int count = 1;
        while (curr != null){
            if(n == count){
                System.out.println("Find nth node from front: "+ curr.data);
                return;
            }
            curr=curr.next;
            count++;
        }
        System.out.println("List has fewer than " + n + " nodes.");
    }
    
    public boolean palindromeLL(Node head){
        if(head == null || head.next == null){
            return true;
        }
        
        Node middle = findMiddle(head);
        Node secondHalf = reverse(middle.next);
        
        Node firsthalf = head;
        while(secondHalf != null){
            if(secondHalf.data != firsthalf.data){
                return false;
            }
            secondHalf = secondHalf.next;
            firsthalf = firsthalf.next;
        }
        
        return true;
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public boolean cycleLL(Node head){
        if(head == null){
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while (hare!=null && hare.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(turtle == hare){
                return true;
            }
        }
        return false;
    }
    
    
    public void remCycleLL(Node head){
        Node fast = head;
        Node slow = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        
        if(isCycle){
            slow = head;
            if(slow == fast){
                while(fast.next != slow){
                    fast = fast.next;
                }
            }
            else{
                while(slow.next != fast.next){
                    fast = fast.next;
                    slow = slow.next;
                }
            }
          fast.next = null;
        }
    }
    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(9);
        list.addLast(10);
        
        list.printLL();
        list.addMiddle(3, 5);
        list.addMiddle(4, 5);

        list.printLL();
        
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(5);
        System.out.println("Size of LL: " + list.getSize());
        System.out.println("5 contains: " + list.contains(5));
        list.deleteLast();
        list.printLL();
        System.out.println("Reverse LL");
        list.head = list.reverseLL(list.head);
        list.printLL();
        System.out.println("Reverse LL using recursion");
        list.head = list.recRevLL(list.head);
        list.printLL();
        list.printNthNodefromEnd(4);
        list.printNthNodefromFirst(4);
        System.out.println("Remove Nth Node from end");
        list.head = list.removeNthNodefromEnd(list.head, 6);
        list.printLL();
        
 
        System.out.println("Is LL is Palindrome: "+ list.palindromeLL(list.head));
        
        System.out.println("Is LL is cycle: "+ list.cycleLL(list.head));
        list.printLL();
        
        // Create loop in LL
        LL.Node temp = list.head;
        while(temp.data != 3){
            temp =temp.next;
        }
        
        LL.Node loopPoint = list.head;
        while(loopPoint.data != 3){
            loopPoint = loopPoint.next;
        }
        temp.next = loopPoint;
        

        System.out.println("Is LL is cycle: "+ list.cycleLL(list.head));
        
        list.remCycleLL(list.head);

        System.out.println("Is LL is cycle: "+ list.cycleLL(list.head));
    }
}