package binarySearchTree;

public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    void getSize();
}
