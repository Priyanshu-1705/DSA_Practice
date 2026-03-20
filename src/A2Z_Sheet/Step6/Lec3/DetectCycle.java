package A2Z_Sheet.Step6.Lec3;
//Ps:141
import java.util.HashMap;
public class DetectCycle {
    static boolean hasCycle(ListNode head) {
        //Brute force
//        HashMap<ListNode,Integer> nodeMap = new HashMap<>();
//        ListNode temp = head;
//        while (temp!=null){
//            if (nodeMap.containsKey(temp)){
//                return true;
//            }else{
//                nodeMap.put(temp,1);
//                temp = temp.next;
//            }
//        }
//        return false;

        //Optimal approach
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
