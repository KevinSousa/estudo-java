package singleton;

public class LazyHolderSingleton {

    private class InstanceHolder {
        private static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
