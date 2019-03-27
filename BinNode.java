package Ch7.BinaryTree;

public interface BinNode {
	BinNode left = null;
	BinNode right = null;
	
	public int value();
    public void setValue(int v);
    public BinNode left();
    public BinNode right();
    public boolean isLeaf();
}
