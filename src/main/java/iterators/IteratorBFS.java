package iterators;

import tree.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IteratorBFS implements Iterator<Node> {
    private Queue<Node> queue = new LinkedList<>();

    public IteratorBFS(Node root) {
        queue.add(root);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public Node next() {
        Node next = queue.poll();
        if(hasNext()){
            queue.addAll( next.getChildren());
        }
        return next;
    }

}
