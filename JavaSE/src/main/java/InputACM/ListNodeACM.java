package InputACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ListNodeACM {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        ListNode head1,head2;
        if((input = bufferedReader.readLine())!=null){
            head1 = stringToListNode(input);
            head2 = stringToListNode(bufferedReader.readLine());
            Merge(head1,head2);
        }
        System.out.println();
    }

    private static ListNode stringToListNode(String input) {
        if(input.length()==0){
            return null;
        }
        input = input.trim();

        String[] tmp = input.split(" ");
        ListNode preNode = new ListNode(Integer.valueOf(tmp[0]));
        ListNode head  = preNode;
        for(int i = 1;i < tmp.length;i++){
            ListNode listNode = new ListNode(Integer.valueOf(tmp[i]));
            preNode.next = listNode;
            preNode = listNode;
        }

        return head;
    }
    //递归
    static ListNode pre = new ListNode(-1);
    public static ListNode reverseKGroup (ListNode head, int k) {
        ListNode tail = head,cur = head,tmp=null;

        pre.next = head;
        for(int i = 0;i < k;i++){
            if(tail==null) return head;
            tail = tail.next;
        }


        while(pre!=null && pre.next!=tail){
            tmp = cur.next;
            if(tmp!=null){
                cur.next = tmp.next;
                tmp.next = pre.next;
                pre.next = tmp;
            }

        }

        pre = cur;
        head.next = reverseKGroup(cur.next,k);

        return pre.next;
    }

//    public static ListNode reverseKGroup (ListNode head, int k) {
//        // write code here
//        if(head==null || k-2 < 0) return head;
//        //最后的头
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode cur = head;
//        //目前小段的头的前一个
//        ListNode curHead = newHead;
//
//        int cnt = 0;
//        while(cur!=null && cur.next!=null){
//
////            System.out.println("curHead:"+curHead.val + "\tcur:"+cur.val);
//
//            if(cnt == 0){
//                boolean res = checkK(cur,k);
//                if(!res){
//                    return newHead.next;
//                }
//            }
//
//            if(cnt < k){
//                ListNode tmp = cur.next;
//                cur.next = tmp.next;
//                tmp.next = curHead.next;
//                curHead.next = tmp;
//                if(cnt==k-2) {
//                    curHead = cur;
//                    cur = cur.next;
//                    cnt = 0;
//                    continue;
//                }
//                cnt++;
//            }
//
////            if(cnt==k) cnt = 0;
//        }
//
//        return newHead.next;
//
//    }
//
//    public static boolean checkK(ListNode head, int k){
//        ListNode cur = head;
//        for(int i = 0;i < k;i++){
//            if(cur==null) return false;
//            cur = cur.next;
//        }
//        return true;
//    }

    public static ListNode Merge(ListNode list1,ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode p1 = list1,p2 = list2;
        ListNode p3 = null;

        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p3.next = p1;
                p3 = p3.next;
                p1 = p1.next;
            }else{
                p3.next = p2;
                p3 = p3.next;
                p2 = p2.next;
            }
        }

        if(p1!=null){
            p3.next = p1;
        }

        if(p2!=null){
            p3.next = p2;
        }
        return p3;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
