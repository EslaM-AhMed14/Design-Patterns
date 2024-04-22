/**
 * Basic implementation of a singleton pattern.
 *
 * This class ensures that only one instance of BasicSingleton is created.
 */

public class BasicSingleton {
    private  static  BasicSingleton instance;

    private BasicSingleton(){
        // Private constructor to prevent instantiation from outside the class.

    }

    /**
     * Returns the singleton instance of BasicSingleton.
     * If the instance is not created yet, it creates one.
     *
     * @return the singleton instance
     */
    public static BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        return instance;
    }
}
