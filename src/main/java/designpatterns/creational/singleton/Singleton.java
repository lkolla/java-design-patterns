package designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    /**
     *
     * @return
     */
    public static Singleton getInstance(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    /**
     * private constructor to restrict the object creation.
     */
    private Singleton(){

    }
}
