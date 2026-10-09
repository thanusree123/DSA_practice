
import java.util.*;

public class linkedlistcycle {

    static class mergenode {
        int data;
        mergenode next;

        mergenode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static mergenode createlist(Scanner s, int n) {
        mergenode head = null;
        mergenode tail = null;

        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            mergenode newNode = new mergenode(value);

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

    static mergenode mergetwolinkedlist(mergenode list1, mergenode list2) {
        mergenode dummy = new mergenode(-1);
        mergenode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }

        return dummy.next;
    }

    static void printList(mergenode head) {
        mergenode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of nodes in List 1: ");
        int n1 = s.nextInt();

        System.out.println("Enter sorted values for List 1:");
        mergenode list1 = createlist(s, n1);

        System.out.print("Enter number of nodes in List 2: ");
        int n2 = s.nextInt();

        System.out.println("Enter sorted values for List 2:");
        mergenode list2 = createlist(s, n2);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        mergenode mergedList = mergetwolinkedlist(list1, list2);

        System.out.println("Merged List:");
        printList(mergedList);

        s.close();
    }
}