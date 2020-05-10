package decorator;

/**
 * @author z
 * @date 2020-05-10 15:32
 */

public abstract class SchoolReport {


    /**
     * 展示成绩
     */
    public abstract void report();


    /**
     * 家长签字
     *
     * @param name 家长姓名
     */
    public abstract void sign(String name);
}
