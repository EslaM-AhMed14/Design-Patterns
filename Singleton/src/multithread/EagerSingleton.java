package multithread;

/**
 * Eagerly initialized singleton class.
 *
 * This class ensures that only one instance of EagerSingleton is created and
 * provides global access to that instance.
 *
 * The issue with this strategy is that if the constructor performs a heavy operation,
 * that will consume a significant amount of time at the start of the program.
 */

public class EagerSingleton {
    private  static  EagerSingleton instance = new EagerSingleton() ;


    private  EagerSingleton(){
        // Private constructor to prevent instantiation from outside the class.
    }

    /**
     * Returns the singleton instance of EagerSingleton.
     *
     * @return the singleton instance
     */
    public  static  EagerSingleton getInstance(){
        return  instance;
    }
}
