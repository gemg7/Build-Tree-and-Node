public class Main {
    public static void main(String[] args) {
        Node<Integer> tree = new Node<>(5);
        Node<Integer> tree2 = new Node<>(2);
        Node<Integer> tree3 = new Node<>(7);
        Node<Integer> tree4 = new Node<>(3);
        Node<Integer> tree5 = new Node<>(1);

        tree.addChild(tree2);
        tree.addChild(tree3);
        tree.addChild(tree4);
        tree.addChild(tree5);

        Tree<Integer> t = new Tree<>(1);

        t.getRoot().addChild(tree);
        System.out.println(t.getNode(7).getData());

    }
}
