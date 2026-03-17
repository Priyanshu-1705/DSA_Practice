package A2Z_Sheet.Step6.Lec3;
//Ps:234

public class PalindromeLL {
    static boolean isPalindrome(ListNode head) {
        //Brute force
//        if (head == null || head.next == null) return true;
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode temp = head;
//        while (temp!=null){
//            list.add(temp.val);
//            temp = temp.next;
//        }
//        int left = 0;
//        int right = list.size()-1;
//        while (left<right){
//            if (list.get(left) != list.get(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

        //Optimal approach
        if (head == null || head.next == null) return true;
        // Step 1: Find middle (slow & fast pointer)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverse(slow);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // save next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev;
    }

}
