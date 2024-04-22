package multithread;

/**
 * Singleton class using lazy initialization.
 *
 * The problem here arises when multiple threads access this method concurrently,
 * which can lead to performance degradation due to synchronization.
 */

public class LazySingleton {
    private  static LazySingleton instance;

    private LazySingleton(){
        // Private constructor to prevent instantiation from outside the class.

    }
    /**
     * Returns the singleton instance.
     *
     * @return the singleton instance
     */
    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
