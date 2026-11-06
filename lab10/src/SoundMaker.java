//public interface SoundMaker {
//    void makeSound();
//    String getSoundType();

//
//}

public interface SoundMaker {
    int MAX_VOLUME = 100;

    void makeSound();

    String getSoundType();

    default void defaultMethod() {
        System.out.println("йоу");
        privateMethod();
    }

    static void staticMethod() {
        System.out.println("йоу");
    }

    private void privateMethod() {
        System.out.println("йоу");
    }

      static void printSoundCategory() {
       System.out.println("Категория: Издающие звуки животные");
    }
}

