package InputACM;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TreeACM {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        if((line=bufferedReader.readLine())!=null){
            TreeNode root = stringToTreeNode(line);
            System.out.println(root.val);
        }

    }

    private static TreeNode stringToTreeNode(String line) {
        if(line.length()==0) return null;

        line = line.trim();
        //层序遍历建二叉树,空指针用-1来代替

        String[] nums = line.split(",");
        LinkedList<TreeNode> q = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.valueOf(nums[0]));
        q.addLast(root);
        int idx = 1;
        while(!q.isEmpty()){
            TreeNode cur = q.removeFirst();
            if(idx==nums.length) break;
            int l = Integer.valueOf(nums[idx]);

            idx++;
            if(idx==nums.length) break;
            int r = Integer.valueOf(nums[idx]);
            idx++;
            if(l!=-1){
                TreeNode left = new TreeNode(l);
                cur.left = left;
                q.addLast(left);
            }else{
                cur.left =  null;
            }
            if(r!=-1){
                TreeNode right = new TreeNode(r);
                cur.right = right;
                q.addLast(right);
            }else{
                cur.right = null;
            }
        }
        return root;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}
