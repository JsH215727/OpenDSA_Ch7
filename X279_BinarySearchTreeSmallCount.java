package Ch7.BinaryTree;

public class X279_BinarySearchTreeSmallCount {
	public int BSTsmallcount(BinNode root, int key) {
		if (root == null)
			return 0;
		int result = 0;

		if (root.left().value() < key) {
			result += 1 + BSTsmallcount(root.left(), key) + BSTsmallcount(root.right(), key);
		} else {
			result += BSTsmallcount(root.left(), key) + BSTsmallcount(root.right(), key);
		}

		return result;
	}
}
