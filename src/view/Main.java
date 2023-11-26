package view;

import controller.content.BinaryTree01;
import controller.content.BinaryTree02;
import controller.content.BinaryTree03;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree01 tree01 = new BinaryTree01();
        BinaryTree02 tree02 = new BinaryTree02();
        BinaryTree03 tree03 = new BinaryTree03();
        try {
            tree01.printResult();
            tree02.printResult();
            tree03.printResult();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
