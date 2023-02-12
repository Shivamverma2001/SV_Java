class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

class LL {
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // System.out.print("null");

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast == null || fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node head;

    public Boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}

public class PalindromeLL {

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        LL pl = new LL();
        // Node n=new Node(4);
        pl.addFirst(4);
        pl.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        pl.print();
        // System.out.println(pl.checkPalindrome());
    }
}