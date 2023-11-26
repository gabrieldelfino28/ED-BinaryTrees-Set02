package controller.content;

import model.binarytrees.integer.IntTree;

public class BinaryTree01 {

    public void printResult() throws Exception{
        System.out.println("--------------BinaryTree 01--------------");

        int[] vet = {30, 15, 10, 20, 60, 40, 80};
        IntTree tree = new IntTree();

        for (int val : vet) {
            tree.insert(val);
        }

        System.out.print("preFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();

        System.out.print("\nRemoving '60' -> ");
        tree.remove(60);
        System.out.print("inFix: ");
        tree.inFixSearch();
    }
}
