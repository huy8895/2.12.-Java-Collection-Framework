package binarySearchTree;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);

        System.out.println("inorder");
        tree.inorder();
        System.out.println("preorder");
        tree.preorder();
        System.out.println("postOrder");
        tree.postOrder();
        System.out.println("-------");
        System.out.println(tree.isExits(6));


    }
}
