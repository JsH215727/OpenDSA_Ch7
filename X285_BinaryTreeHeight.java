package Ch7.BinaryTree;

public class X285_BinaryTreeHeight {
	public int BTheight(BinNode root) {
		if (root == null) {
			return 0;
		}
		
		if (root.left() == null && root.right() == null) {
			return 1;
		}
		
		return Math.max(BTheight(root.left()) + 1, BTheight(root.right()) + 1);
	}
}
