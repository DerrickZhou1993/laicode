//Given a binary tree in which each node contains an integer number. 
//Determine if there exists a path (the path can only be from one node to itself or to any of its descendants), 
//the sum of the numbers on the path is the given target number.

//Examples
//      5
//    /    \
//  2      11
//       /    \
//      6     14
//    /
//   3
//
//If target = 17, There exists a path 11 + 6, the sum of the path is target.
//If target = 20, There exists a path 11 + 6 + 3, the sum of the path is target.
//If target = 10, There does not exist any paths sum of which is target.
//If target = 11, There exists a path only containing the node 11.

//How is the binary tree represented?
//We use the level order traversal sequence with a special symbol "#" denoting the null node.

//For Example:
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
//      1
//    /   \
//   2     3
//        /
//      4




// My solution
//
/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean exist(TreeNode root, int target) {
    Set<Integer> hashset = new HashSet<Integer>();
    hashset.add(0);
    return prefixSum(root, target, 0, hashset);
  }
  
  private boolean prefixSum(TreeNode root, int target, int prefixSum, Set<Integer> hashset) {
    if (root == null) {
      return false;
    }
    
    prefixSum += root.key;
    if (hashset.contains(prefixSum - target)) {
      return true;
    }
    boolean noDuplicate = hashset.add(prefixSum); 
    
    if (root.left != null && prefixSum(root.left, target, prefixSum, hashset)) {
      return true;
    }
    if (root.right != null && prefixSum(root.right, target, prefixSum, hashset)) {
      return true;
    }
    if (noDuplicate){
      hashset.remove(prefixSum);
    }
    return false;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.219r2a4hr6pm



