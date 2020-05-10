package chains;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z
 * @date 2020-05-10 16:00
 */
public class FilterChain implements Filter {

    private List<Filter> filterList = new ArrayList<Filter>();


    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
