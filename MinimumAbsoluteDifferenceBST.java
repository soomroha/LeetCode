
public class MinimumAbsoluteDifferenceBST {

	
	public static void main(String args[]) {
		
		System.out.println("abc".substring(0,1));
	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        rst.addAll(inorderTraversal(root.left));
        rst.add(root.val);
        rst.addAll(inorderTraversal(root.right));
        return rst;
    }
    
    public int minDiffInBST(TreeNode root) {
        
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
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        rst.addAll(inorderTraversal(root.left));
        rst.add(root.val);
        rst.addAll(inorderTraversal(root.right));
        return rst;
    }
    
    public static int minDiffInBST(TreeNode root) {
        
        List<Integer> inorder = inorderTraversal(root);
        int min = 
        
    }
	
	public static String solution() {
		
        String [] strs = {"hasaan", "hasachoot", "hasaqwer"};
        
        if (strs.length == 0 || strs.length == 1){
            return "";
        }
        
        String s1 = strs[0];
        String prefix = "";
        
        for(int i = 0; i < s1.length(); i++) {
        		char c = s1.charAt(i);
        		boolean occursInAll = true;
        		for(int j = 1; j < strs.length; j++) {
        			String s = strs[j];
        			if(i >= s.length()) {
        				occursInAll = false;
        				break;
        			}
        			
        			if(s.charAt(i) != c) {
        				occursInAll = false;
        				break;
        			}
        		}
        		
        		if(occursInAll) {
        			prefix += c;
        		}
        		else {
        			break;
        		}
        }
        
        return prefix;
        
	}
}
