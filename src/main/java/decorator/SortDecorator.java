package decorator;

/**
 * @author z
 * @date 2020-05-10 15:41
 */
public class SortDecorator extends Decorator {
    public SortDecorator() {
    }

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report(){
        System.out.println("我排名20");
        super.report();
    }


}
