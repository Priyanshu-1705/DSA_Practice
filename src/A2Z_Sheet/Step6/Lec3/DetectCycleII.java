package A2Z_Sheet.Step6.Lec3;
//Ps:142
import java.util.HashMap;

public class DetectCycleII {
    static ListNode detectCycle(ListNode head) {
        //Brute force
//        HashMap<ListNode,Integer> nodeMap = new HashMap<>();
//        ListNode temp = head;
//        while (temp!=null){
//            if (nodeMap.containsKey(temp)){
//                return temp;
//            }else{
//                nodeMap.put(temp,1);
//                temp = temp.next;
//            }
//        }
//        return null;

        //Optimal approach
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Traverse while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;
            // If they meet, cycle is present
            if (slow == fast) {
                // Reset slow to head
                slow = head;
                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // Return the starting node of loop
                return slow;
            }
        }
        // If no cycle found
        return null;
    }

}
