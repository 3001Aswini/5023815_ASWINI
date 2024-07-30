public class TestSingleton {
    public static void main(String [] args){
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();

        System.out.println("Logger 1 hashcode: "+logger1.hashCode());
        System.out.println("Logger 2 hashcode: "+logger2.hashCode());

        logger1.log("This is a log message");
        logger2.log("This is another log message");

        if(logger1==logger2){
            System.out.println("Both logger1 and logger2 are the same instance.");

        }else{
            System.out.println("Different instances for logger1 and logger2.");
        }
    }
    
}
