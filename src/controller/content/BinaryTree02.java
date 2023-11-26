package controller.content;

import model.binarytrees.integer.IntTree;

public class BinaryTree02 {

    public void printResult() throws Exception{
        System.out.println("\n\n--------------BinaryTree 02--------------");

        int[] vet = {12,4,2,8,6,16};
        IntTree tree = new IntTree();

        for (int val : vet) {
            tree.insert(val);
        }
        tree.search(6);
        System.out.println();

        System.out.print("preFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();

        System.out.print("\nRemoving '12' -> ");
        tree.remove(12);
        System.out.print("postFix: ");
        tree.postFixSearch();
    }
}
