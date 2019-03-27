package Ch7.BinaryTree;

public class X281_BinaryTreeSetDepth {
	public BinNode BTsetdepth(BinNode binNode, int depth) {
		if (binNode == null) {
			return null;
		}
		BTsetdepth(binNode.left(), depth + 1);
		binNode.setValue(depth);
		BTsetdepth(binNode.right(), depth + 1);
		return binNode;
	}
}
