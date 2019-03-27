package Ch7.BinaryTree;

public class X287_BinaryTreeLeafNodesCount {
	public int BTleaf(BinNode root) {
		if (root == null) {
			return 0;
		}

		if (root.isLeaf()) {
			return 1;
		}

		return BTleaf(root.left()) + BTleaf(root.right());
	}
}
