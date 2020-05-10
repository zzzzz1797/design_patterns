package chains;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z
 * @date 2020-05-10 16:04
 */
public class SensitiveFilter implements Filter {
    final static String[] WORDS = {"逼", "操"};

    @Override
    public boolean doFilter(Msg msg) {
        String content = msg.getContent();

        for (String word : WORDS) {
            String tmpContent = content.replaceAll(word, "*");
            if (!tmpContent.equals(content)) {
                return false;
            }
        }
        msg.setContent(content);
        return true;
    }
}
