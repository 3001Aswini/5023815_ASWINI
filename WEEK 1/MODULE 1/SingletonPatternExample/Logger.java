public class Logger{
    private static Logger instance;

    private Logger(){};

    public static Logger getInstance(){
        if(instance==null){
            synchronized(Logger.class){
                if(instance==null){
                    instance=new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Log message: "+message);
    }

}
//The Singleton design pattern is a creational pattern that ensures the creation
// of only one instance of a class and provides a global point of access to it.