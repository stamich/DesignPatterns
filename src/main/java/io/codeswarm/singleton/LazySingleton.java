package io.codeswarm.singleton;

/**
 * Lazy version of Singleton pattern.
 * The instance is created only when is needed
 * (on the call of getInstance method).
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
