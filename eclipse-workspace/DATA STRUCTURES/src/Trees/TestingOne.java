package Trees;

public class TestingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(30);
		tree.insert(25);
		tree.insert(6);
		tree.insert(35);
		tree.insert(2);
		tree.insert(8);
		tree.insert(40);
		
		tree.printInOrder();
		System.out.println();
		System.out.println("======================================");
		tree.printPreOrder();
		System.out.println();
		System.out.println("======================================");
		tree.printPostOrder();
		

	}

}
