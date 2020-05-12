import composite.BranchNode;
import composite.LeafNode;
import composite.Node;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-12 23:39
 */
public class CompositeTest {

    @Test
    public void test01() {
        BranchNode rootNode = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");

        Node node01 = new LeafNode("c11");
        Node node02 = new LeafNode("c22");
        BranchNode b21 = new BranchNode("selection21");
        Node node03 = new LeafNode("c221");
        Node node04 = new LeafNode("c212");

        rootNode.addNode(chapter1);
        rootNode.addNode(chapter2);
        chapter1.addNode(node01);
        chapter1.addNode(node02);
        b21.addNode(node03);
        b21.addNode(node04);
        chapter2.addNode(b21);
        rootNode.addNode(b21);

        rootNode.tree(rootNode, 0);
    }
}
