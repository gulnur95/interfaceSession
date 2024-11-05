package task2;

public class UpperCaseFormatter implements MessageFormatter {



    @Override
    public String formatMessage(String message) {
        return message.toUpperCase();
    }
}
