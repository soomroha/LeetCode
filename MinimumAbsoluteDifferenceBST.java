import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceBST {

	public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
		

	
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> inorder = inorderTraversal(root);
        int min_diff = Math.abs(inorder.get(0) - inorder.get(1));
        
        for(int i = 0; i < inorder.size(); i++){
            if(i + 1 <= inorder.size()-1){
                int diff = Math.abs(inorder.get(i) - inorder.get(i+1));
                if(diff < min_diff){
                    min_diff = diff;
                }
            }
        }
        
        return min_diff;
        
    }
}
