package Trees;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	//Create contractors 
	public TreeNode() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public TreeNode(int data) {
		
		this.data = data;
	}
	public void insert(int value) {
		if(value<data)
		{
			if(left == null)
			{
				left = new TreeNode(value);
			}
			else
			{
				left.insert(value);
			}
		}
		else
		{
			if(right == null)
			{
				right = new TreeNode(value);
			}
			else
			{
				right.insert(value);
			}
		}
	}
	public void printInOrder() {
		if(left !=null)
		{
			left.printInOrder();
		}
		System.out.print(data+" ");
		if(right != null)
		{
			right.printInOrder();
		}
	}
	public void printPreOrder() {
		System.out.print(data+" ");
		if(left !=null)
		{
			left.printInOrder();
		}
		
		if(right != null)
		{
			right.printInOrder();
		}
	}
	public void printPostOrder() {
		
		if(left !=null)
		{
			left.printInOrder();
		}
		
		if(right != null)
		{
			right.printInOrder();
		}
		System.out.print(data+" ");
	}
	

	
	

}
