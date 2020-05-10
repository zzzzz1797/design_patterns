package chains;

/**
 * @author z
 * @date 2020-05-10 16:02
 */
public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String content = msg.getContent();
        content = content.replace("<", "[");
        content = content.replace(">", "]");
        msg.setContent(content);
        return true;
    }
}
