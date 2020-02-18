package iterators;

import tree.Node;

import java.util.Iterator;
import java.util.Stack;

public class IteratorDFS implements Iterator<Node> {
    private Stack<Node> stack = new Stack<>();
    private Node next;

    public IteratorDFS(Node root) {
        stack.add(root);
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Node next() {
        next = stack.pop();
        stack.addAll(next.getChildren());
        return next;
    }
}
