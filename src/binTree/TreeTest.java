package binTree;

import java.util.Random;

public class TreeTest {
	
	public static void main(String[] args){
		
		BinTree tree = new BinTree();
		int value;
		Random randomNumber = new Random();
		System.out.println("building binary tree..");
		for (int i = 1; i <= 10; i++){
			value = randomNumber.nextInt(100);
			System.out.printf("%d ", value);
			tree.insertNode(value);
		}
		System.out.println("\n\nInorder traversal");
		tree.treeWalk();
	}
	
}
