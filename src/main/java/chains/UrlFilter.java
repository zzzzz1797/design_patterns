package chains;

/**
 * @author z
 * @date 2020-05-10 16:11
 */
public class UrlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String content = msg.getContent();
        content = content.replaceAll("http://", "https://");
        msg.setContent(content);
        return true;
    }
}
