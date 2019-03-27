package Ch7.BinaryTree;

public class X288_MirrorImageBT {
	public boolean MBTmirror(BinNode root1, BinNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null ^ root2 == null) {
			return false;
		}

		if (root1.value() == root2.value()) {
			return MBTmirror(root1.left(), root2.right()) && MBTmirror(root1.right(), root2.left());
		}

		return false;
	}
}
