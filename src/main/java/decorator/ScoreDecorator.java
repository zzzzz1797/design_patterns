package decorator;

/**
 * @author z
 * @date 2020-05-10 15:38
 */
public class ScoreDecorator extends Decorator {

    public ScoreDecorator() {
    }

    public ScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }


    @Override
    public void report() {
        System.out.println("我们班，语文最高分是：77，数学最高分是80，英语最高分是：81");
        super.report();
    }

}
