// Define ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

// Define AddTwoNumbers class
public class AddTwoNumbers {
    // Define addTwoNumbers method outside of the main method
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode l3Head = l3;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1Val = 0;
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }

            int l2Val = 0;
            if (l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }

            int value = l1Val + l2Val + carry;
            l3.next = new ListNode(value % 10);
            carry = value / 10;
            l3 = l3.next;
        }

        if (carry != 0) {
            l3.next = new ListNode(carry);
        }

        return l3Head.next;
    }

    // Define the main method
    public static void main(String[] args) {
        // Test the addTwoNumbers method
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
