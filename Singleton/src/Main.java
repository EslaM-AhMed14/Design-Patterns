
public class Main extends  Thread {
    /**
     * Thread implementation to demonstrate singleton pattern usage.
     */

    public void run(){
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        System.out.println(basicSingleton);
    }
    public static void main(String[] args) {

        BasicSingleton instanceOne = BasicSingleton.getInstance();
        BasicSingleton instanceTwo = BasicSingleton.getInstance();

        System.out.println("Same Instance?: " + (instanceOne == instanceTwo));

        System.out.println("-----\n");

        /* Access the Basic Structure with multiple threads
         * Sometimes, more than one instance may be created,
         * indicating that this implementation is not safe in a multi-threaded environment.
         */
        for (int i = 0 ; i <20 ; i++ ){
            Main main = new Main();
            main.start();
        }


    }
}