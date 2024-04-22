package multithread;

/**
 * Singleton class implemented using the Enum type.
 *
 * This class represents a singleton pattern where only one instance of EnumSingleton is created,
 * providing global access to that instance through the ENUM_SINGLETON enum constant.
 */

public enum EnumSingleton {
    ENUM_SINGLETON;

    public void print(String nam){
        System.out.println("hi" +nam );
    }
}
