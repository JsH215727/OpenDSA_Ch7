package Ch7.BinaryTree;

public class X286_BinaryTreeCheckSum {
	@SuppressWarnings("static-access")
	public boolean BTchecksum(BinNode root) {
		int left = 0;
		int right = 0;

		if (root == null || (root.left == null && root.right == null)) {
			return true;
		} else {
			if (root.left != null) {
				left = root.left.value();
			}

			if (root.right != null) {
				right = BinNode.right.value();
			}

			if ((root.value() == left + right) && BTchecksum(root.left) && BTchecksum(root.right)) {
				return true;
			} else {
				return false;
			}
		}
	}
}