import java.util.*;

public class middlenode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = s.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.print("[");

        Node current = slow;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(",");
            }

            current = current.next;
        }

        System.out.println("]");

        s.close();
    }
}