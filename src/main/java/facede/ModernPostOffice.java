package facede;

/**
 * @author z
 * @date 2020-05-07 23:47
 */
public class ModernPostOffice {

    private LetterProcessImpl letterProcess = new LetterProcessImpl();


    public void sendLetter(String letterContext, String sendAddress) {

        letterProcess.writeContext(letterContext);
        letterProcess.fillEnvelope(sendAddress);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
