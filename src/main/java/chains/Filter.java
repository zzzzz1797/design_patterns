package chains;

/**
 * 过滤消息内容
 *
 * @author z
 */
public interface Filter {

    public boolean doFilter(Msg msg);
}
