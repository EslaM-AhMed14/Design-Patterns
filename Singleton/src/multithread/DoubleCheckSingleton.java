package multithread;

/**
 * Singleton class using double-checked locking for lazy initialization.
 *
 * This class ensures that only one instance of DoubleCheckSingleton is created,
 * and provides global access to that instance. It uses double-checked locking
 * to ensure thread safety and lazy initialization.
 */

public class DoubleCheckSingleton {

    private volatile  static DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){
        // Private constructor to prevent instantiation from outside the class.

    }


    /**
     * Returns the singleton instance of DoubleCheckSingleton.
     *
     * @return the singleton instance
     */

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null)
                    instance = new DoubleCheckSingleton();
            }
        }
        return instance;
    }
}
