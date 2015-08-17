public class RedBlackNode {
    public int color;
    public double data;
    public RedBlackNode parent;
    public RedBlackNode left;
    public RedBlackNode right;

    public final int RED = 0;
    public final int BLACK = 1;


    public RedBlackNode(double _data)
    {
        color = RED;
        data = _data;
        parent = null;
        left = null;
        right = null;
    }
    public RedBlackNode(int _data, RedBlackNode _parent, RedBlackNode _left, RedBlackNode _right)
    {
        color = RED;
        data = _data;
        parent = _parent;
        left = _left;
        right = _right;
    }

}