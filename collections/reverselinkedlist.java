import java.util.*;

class ReverseNode {
    int data;
    ReverseNode next;

    ReverseNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class reverselinkedlist {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        ReverseNode head = null;
        ReverseNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = s.nextInt();
            ReverseNode newNode = new ReverseNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        ReverseNode prev = null;
        ReverseNode current = head;

        while (current != null) {

            ReverseNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        s.close();
    }
}