package Ch7.BinaryTree;

public class X283_BinaryTreeSumNodes {
	public int BTsumall(BinNode root) {
		if (root == null) {
			return 0;
		} else {
			return root.value() + BTsumall(root.left()) + BTsumall(root.right());
		}
	}
}
