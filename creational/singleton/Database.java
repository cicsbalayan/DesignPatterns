package creational.singleton;

//Let's say this is the model Singleton Class for our demo
public class Database {

    //Private constructor to prevent instantiation
    private Database(){};

    //Static holder class for holding the instance
    private static class Holder{
        private static final Database instance = new Database();
    }

    public static Database getInstance(){
        return Holder.instance;
    }

}
