package Ch7.BinaryTree;

public class X286_BinaryTreeCheckValue {
	public boolean BTcheckval(BinNode root, int value) {
		if (root == null) {
			return false;
		}
		
		if (root.value() == value) {
			return true;
		}
		
		return BTcheckval(root.left(), value) || BTcheckval(root.right(), value);
	}
}
