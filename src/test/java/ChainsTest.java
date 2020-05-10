import chains.*;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-10 16:06
 */
public class ChainsTest {
    Msg msg = new Msg("<p>一个苦操的996的程序员.......http://baidu.com");


    @Test
    public void test1() {
        System.out.println(msg);
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter()).addFilter(new UrlFilter());

        filterChain.doFilter(msg);
        System.out.println(msg);
    }
}
