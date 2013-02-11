package binTree;

public class BinTree {
	
	private Node root;
	
	private static class Node{
		Node left;
		Node right;
		int value;
		
		Node(int newValue){
			left = null;
			right = null;
			value = newValue;
		}
		
	}
	
	BinTree(){
		root = null;
	}
	
	public void insertNode(int value){
		root = insertNode(root, value);
	}
	
	private Node insertNode(Node node, int value){
		
		if (node==null){
			node = new Node(value);
		}
		else{
			if (value <= node.value){
				node.left = insertNode(node.left, value);
			}
			else {
				node.right = insertNode(node.right, value);
			}
		}
		return(node);
	}
	
	public void treeWalk(){
		
		treeWalk(root);
	}
	
	private void treeWalk(Node node){
		
		if(node != null){
			
			treeWalk(node.left);
			System.out.println(node.value);
			treeWalk(node.right);
		}
		
	}
}
