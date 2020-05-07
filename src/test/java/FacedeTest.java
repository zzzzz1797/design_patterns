import facede.LetterProcessImpl;
import facede.ModernPostOffice;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-07 23:44
 */
public class FacedeTest {

    @Test
    public void badHand() {
        /**
         * 从下面的调用过程中，我们可以看出写信到寄信的过程比较繁琐，如果中间要多一个步骤，那么整体代码块就得改。
         */
        LetterProcessImpl letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("哈哈哈");
        letterProcess.fillEnvelope("2048");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();


    }


    @Test
    public void greadHand() {
        /**
         * 相比较于上面的过程，步骤简化了不少，并且扩展性也增强了，如果想寄信中加步骤（比如检查信件内容），就只需要改modernPostOffice里面，而调用
         * 方可以不用改
         */
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        modernPostOffice.sendLetter("哈哈哈", "2048");
    }
}
