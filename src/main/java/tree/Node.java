package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<Node> children = new ArrayList<>();
    private Node parent;
    private Type type;
    private int priority;

    public Node() {
    }

    void addChild(Node node) {
        children.add(node);
    }

    public static Builder newBuilder() {
        return new Node().new Builder();
    }

    public Node(String name, List<Node> children, Node parent, Type type, int priority) {
        this.name = name;
        this.children = children;
        this.parent = parent;
        this.type = type;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public class Builder {
        public Builder(){ }

        public Builder name(String name) {
            Node.this.name = name;
            return this;
        }

        public Builder type(Type type) {
            Node.this.type = type;
            return this;
        }

        public Builder priority(int priority) {
            Node.this.priority = priority;
            return this;
        }

        public Builder children(List<Node> children) {
            Node.this.children = children;
            return this;
        }

        public Node build() {
            return Node.this;
        }
    }

}
