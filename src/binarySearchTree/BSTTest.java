package binarySearchTree;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        System.out.println(tree.insert(1));
        System.out.println(tree.insert(2));
        System.out.println(tree.insert(3));
        System.out.println(tree.insert(2));

        tree.inorder();

    }
}
