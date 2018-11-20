package ua.com.golubov.algo.educative.arrays;

public class Test {

    public static LinkedListNode reverse_iterative(
            LinkedListNode head) {
        // no need to reverse if head is null
        // or there is only 1 node.
        if (head == null ||
                head.next == null) {
            return head;
        }

        LinkedListNode list_to_do = head.next;
        LinkedListNode reversed_list = head;

        reversed_list.next = null;

        while (list_to_do != null) {
            LinkedListNode temp = list_to_do;
            list_to_do = list_to_do.next;

            temp.next = reversed_list;
            reversed_list = temp;
        }

        return reversed_list;
    }

    public static LinkedListNode reverse_recursive(
            LinkedListNode head) {
        //no need to reverse if head is
        //null or there is only 1 node.
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode reversed_list =
                reverse_recursive(head.next);

        head.next.next = head;
        head.next = null;
        return reversed_list;
    }

    public static void main(String[] args) {
        LinkedListNode list_head = null;
        list_head = LinkedListNode.create_random_list();

        System.out.print("Original: ");
        LinkedListNode.display(list_head);

        list_head = reverse_recursive(list_head);
        System.out.print("After Reverse (Recursive):");
        LinkedListNode.display(list_head);
    }

    private static class LinkedListNode {
        int value;
        LinkedListNode next;

        LinkedListNode(int value) {
            this.value = value;
        }

        private static LinkedListNode create_random_list() {
            LinkedListNode result = new LinkedListNode(0);
            LinkedListNode temp = new LinkedListNode(1);
            result.next = temp;
            for (int i = 2; i < 10; i++) {
                temp.next = new LinkedListNode(i);
                temp = temp.next;
            }
            return result;
        }

        private static void display(LinkedListNode node) {
            System.out.println();
            while (node.next != null) {
                System.out.print(node.value + " ");
                node = node.next;
            }
            System.out.println(node.value + " ");
        }
    }

}
