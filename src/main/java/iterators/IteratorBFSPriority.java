package iterators;

import tree.Node;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;

public class IteratorBFSPriority implements Iterator<Node> {
    private Deque deque;
    Node n;
    Comparator<Node> comparator = ((o1, o2) -> o1.getPriority() - o2.getPriority());

    public IteratorBFSPriority(Node root) {
        this.n = root;
        deque = new ArrayDeque();
    }

    @Override
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    @Override
    public Node next() {
        return null;
    }
}
