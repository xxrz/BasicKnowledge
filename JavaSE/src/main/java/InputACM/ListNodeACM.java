package InputACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ListNodeACM {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        ListNode head;
        if((input = bufferedReader.readLine())!=null){
            head = stringToListNode(input);
        }
        System.out.println();
    }

    private static ListNode stringToListNode(String input) {
        if(input.length()==0){
            return null;
        }
        input = input.trim();

        String[] tmp = input.split(",");
        ListNode preNode = new ListNode(Integer.valueOf(tmp[0]));
        ListNode head  = preNode;
        for(int i = 1;i < tmp.length;i++){
            ListNode listNode = new ListNode(Integer.valueOf(tmp[i]));
            preNode.next = listNode;
            preNode = listNode;
        }

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
