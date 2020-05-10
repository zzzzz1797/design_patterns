import decorator.MySchoolReport;
import decorator.ScoreDecorator;
import decorator.SortDecorator;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-10 15:42
 */
public class DecoratorTest {
    MySchoolReport mySchoolReport = new MySchoolReport();


    @Test
    public void scoreTest(){
        ScoreDecorator scoreDecorator = new ScoreDecorator(mySchoolReport);
        scoreDecorator.report();
        scoreDecorator.sign("ff");
    }


    @Test
    public void sortTest(){
        SortDecorator sortDecorator = new SortDecorator(mySchoolReport);
        sortDecorator.report();
        sortDecorator.sign("ff1");
    }
}
