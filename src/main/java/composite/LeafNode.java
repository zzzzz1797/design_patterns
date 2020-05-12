package composite;

/**
 * @author z
 * @date 2020-05-12 23:37
 */
public class LeafNode extends Node {
    private String context;

    public LeafNode(String context) {
        this.context = context;
    }

    /**
     * 打印节点
     */
    @Override
    public void print() {
        System.out.println(context);
    }
}
