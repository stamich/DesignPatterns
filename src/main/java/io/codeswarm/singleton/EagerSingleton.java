package io.codeswarm.singleton;

/**
 * Eager version of Singleton pattern.
 * The instance is created when the class is loaded.
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();
    private EagerSingleton() {
    }
    public static EagerSingleton getInstance() {
        return singleton;
    }
}
