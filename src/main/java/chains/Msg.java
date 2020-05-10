package chains;

/**
 * @author z
 * @date 2020-05-10 15:57
 */
public class Msg {
    private String content;

    public Msg() {
    }

    public Msg(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"content\":\"")
                .append(content).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
