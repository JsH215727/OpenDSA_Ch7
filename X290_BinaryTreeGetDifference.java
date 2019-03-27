package Ch7.BinaryTree;

public class X290_BinaryTreeGetDifference {
	public int BTgetdiff(BinNode root) {
		if (root == null) {
			return 0;
		}

		return Sum(root) + Sum(root.left()) + Sum(root.right());
	}

	public static int Sum(BinNode root) {
		int sum = 0;

		if (root == null) {
			return sum;
		}

		sum += root.value();

		if (root.left() != null) {
			sum += Sum(root.left().left()) + Sum(root.left().right());
		}

		if (root.right() != null) {
			sum += Sum(root.right().left()) + Sum(root.right().right());
		}

		return sum;
	}
}
