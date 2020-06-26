import sun.reflect.generics.tree.Tree;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
       val = x;
    }
}
public class Solution {
    public TreeNode buildTree(int[] preOrder, int[] inOrder){
        if (preOrder == null || preOrder.length == 0 ){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int inOrderIndex = 0;
        for (int i =1; i < preOrder.length; i++) {
            int preOrderVal = preOrder[i];
            TreeNode node =stack.peek();
            if (node.val != inOrder[inOrderIndex]) {
                node.left = new TreeNode(preOrderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inOrder[inOrderIndex]) {
                    node = stack.pop();
                    inOrderIndex++;
                }
                node.right = new TreeNode(preOrderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
}
