package tree;

import algorithms.Replace.ReplaceNodeWithSumOfSomething;
import dp.DynamicProgramming.LIS;
import sampletree.SampleTrees.SampleTree;
import treetraversals.TreeTraversals.TreeTraversal;
import utility.Utilities.Utility;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Node<Integer> root = SampleTree.getSampleTree();
		Node<Integer> updatedRoot=ReplaceNodeWithSumOfSomething.replaceNodeWithSumUtil(root);
		TreeTraversal.preOrderTraversal(updatedRoot);*/
		Utility.Print(LIS.lis(new int[] { 10, 22, 9, 33, 21, 50, 41, 60 }));
	}

}