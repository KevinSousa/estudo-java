package singleton;

public class Main {
    public static void main(String[] args) {

        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);
        lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);
        eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton holder = LazyHolderSingleton.getInstance();
        System.out.println(holder);
        holder = LazyHolderSingleton.getInstance();
        System.out.println(holder);

    }
}
