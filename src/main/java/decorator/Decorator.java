package decorator;

/**
 * @author z
 * @date 2020-05-10 15:36
 */
public class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    /**
     * 展示成绩
     */
    @Override
    public void report() {
        schoolReport.report();
    }

    /**
     * 家长签字
     *
     * @param name 家长姓名
     */
    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }


    public Decorator() {
    }

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }
}
