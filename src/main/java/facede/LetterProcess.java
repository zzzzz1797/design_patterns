package facede;

/**
 * @author z
 * @date 2020-05-07 23:38
 */
public interface LetterProcess {
    /**
     * 写信
     *
     * @param context
     */
    public void writeContext(String context);

    /**
     * 写信封
     *
     * @param address
     */
    public void fillEnvelope(String address);

    /**
     * 将信装入信封
     */
    public void letterIntoEnvelope();

    /**
     * 邮递信件
     */
    public void sendLetter();
}
