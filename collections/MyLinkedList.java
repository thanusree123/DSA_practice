// import java.util.*;
// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }
// public class MyLinkedList {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if (n <= 0) {
//             return;
//         }

//         Node head = null;
//         Node tail = null;

//         for (int i = 0; i < n; i++) {

//             int value = sc.nextInt();

//             Node newNode = new Node(value);

//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         sc.close();
//     }
// }