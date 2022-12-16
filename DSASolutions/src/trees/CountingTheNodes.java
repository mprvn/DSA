package src.trees;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
public class CountingTheNodes {
    int count =  1;
    public int solve(TreeNode A) {
        count = count(A, 0);

        return count;
    }

    public int count(TreeNode A, int max) {
        if(A == null ) return 0;
        if(A.val > max){
            return  1+ count(A.left, A.val)+count(A.right, A.val);
        }else {
            return   count(A.right, max)+count(A.left, max);
        }
    }
}
