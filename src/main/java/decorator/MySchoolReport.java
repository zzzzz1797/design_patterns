package decorator;

/**
 * @author z
 * @date 2020-05-10 15:34
 */
public class MySchoolReport extends SchoolReport {
    /**
     * 展示成绩
     */
    @Override
    public void report() {
        System.out.println("数学考了：60，语文考了：70，英语考了80");
    }

    /**
     * 家长签字
     */
    @Override
    public void sign(String name) {
        System.out.println("家长签字：" + name);
    }
}
