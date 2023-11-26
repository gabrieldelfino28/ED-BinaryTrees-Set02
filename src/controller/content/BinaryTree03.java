package controller.content;

import model.binarytrees.chars.CharTree;

public class BinaryTree03 {

    public void printResult() throws Exception{
        System.out.println("\n\n--------------BinaryTree 03--------------");

        char[] vet = {'k', 'd', 'b', 'c', 'f', 'm', 'l', 't', 'p', 'r', 'z'};
        CharTree tree = new CharTree();

        for (char val : vet) {
            tree.insert(val);
        }

        System.out.print("\nRemoving 'm' -> ");
        tree.remove('m');
        tree.search('r');

        System.out.print("\npreFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();
    }
}
