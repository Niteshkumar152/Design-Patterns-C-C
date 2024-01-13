public class Main {
    public static void main(String[] args) {
        LogProcessor processor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        processor.log(LogProcessor.ERROR,"exception happens");
        System.out.println("---------");
        processor.log(LogProcessor.DEBUG,"need to debug this");
        System.out.println("---------");
        processor.log(LogProcessor.INFO,"information only");
        System.out.println("---------");
    }
}