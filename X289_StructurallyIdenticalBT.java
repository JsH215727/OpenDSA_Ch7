package Ch7.BinaryTree;

public class X289_StructurallyIdenticalBT {
	public boolean MBTstructure(BinNode root1, BinNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null ^ root2 == null) {
			return false;
		}

		return MBTstructure(root1.left(), root2.left()) && MBTstructure(root1.right(), root2.right());
	}
}
