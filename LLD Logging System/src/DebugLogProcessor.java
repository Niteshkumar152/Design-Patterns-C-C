public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }else {
            System.out.println("debug log forwarding..... ");
            super.log(logLevel,message);
        }
    }
}
