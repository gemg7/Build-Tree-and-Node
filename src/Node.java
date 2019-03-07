import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    private E data;
    private List<Node<E>> children;

    Node(E data) {
        this.data = data;
        children = null;
    }

    E getData() {
        return this.data;
    }

    List<Node<E>> getChildren() {
        return this.children;
    }

    void setData(E data) {
        this.data = data;
    }

    void addChild(Node<E> child) {
        if(children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

}
