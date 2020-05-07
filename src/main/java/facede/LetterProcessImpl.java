package facede;

/**
 * @author z
 * @date 2020-05-07 23:41
 */
public class LetterProcessImpl implements LetterProcess {
    /**
     * 写信
     *
     * @param context
     */
    @Override
    public void writeContext(String context) {
        System.out.println("写信：" + context);
    }

    /**
     * 写信封
     *
     * @param address
     */
    @Override
    public void fillEnvelope(String address) {
        System.out.println("写信封：" + address);
    }

    /**
     * 将信装入信封
     */
    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放入信封中");
    }

    /**
     * 邮递信件
     */
    @Override
    public void sendLetter() {
        System.out.println("邮递信件");
    }
}
