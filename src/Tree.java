import java.util.LinkedList;
import java.util.Queue;

public class Tree<E> {
    Node<E> root;

    Tree(E rootData) {
        root = new Node<>(rootData);
    }

    Node<E> getRoot() {
        return root;
    }

    Node<E> getNode(E data) {
        if(root == null) {
            return null;
        }
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node<E> curr = queue.remove();
            if(curr.getData() == data) {
                return curr;
            }
            if(curr.getChildren() != null) {
                for (Node<E> node : curr.getChildren()) {
                    queue.add(node);
                }
            }
        }
        return null;
    }
}
