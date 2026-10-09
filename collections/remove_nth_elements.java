
import java.util.Scanner;

public class remove_nth_elements {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Remove the nth node from the end
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Create slow and fast pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Step 3: Move fast forward by n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Step 4: Move both pointers together
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 5: Remove the target node
        slow.next = slow.next.next;

        // Step 6: Return the updated list
        return dummy.next;
    }

    // Create linked list using user input
    public static ListNode createList(Scanner sc, int size) {
        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("List must contain at least one node.");
            sc.close();
            return;
        }

        ListNode head = createList(sc, size);

        System.out.println("Original linked list:");
        printList(head);

        System.out.print("Enter n (position from the end to remove): ");
        int n = sc.nextInt();

        if (n < 1 || n > size) {
            System.out.println("Invalid n. Enter a value from 1 to " + size + ".");
        } else {
            head = removeNthFromEnd(head, n);

            System.out.println("Updated linked list:");
            printList(head);
        }

        sc.close();
    }
}

