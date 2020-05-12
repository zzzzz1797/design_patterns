package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z
 * @date 2020-05-12 23:37
 */
public class BranchNode extends Node {
    private List<Node> nodes = new ArrayList<Node>();
    private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    public BranchNode() {
    }

    /**
     * 打印节点
     */
    @Override
    public void print() {
        System.out.println(this.name);
    }


    public void addNode(Node node) {
        this.nodes.add(node);
    }


    public void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        node.print();

        if (node instanceof BranchNode) {
            for (Node n : ((BranchNode) node).nodes) {
                tree(n, depth + 1);
            }
        }
    }
}

