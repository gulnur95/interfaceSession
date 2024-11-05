package task2;

public class LowerCaseFormatter implements MessageFormatter {


    @Override
    public String formatMessage(String message) {
        return message.toLowerCase();
    }
}
