public class Main {
    public static void main(String[] args) {
        SoundMaker.printSoundCategory();
        System.out.println();

                System.out.println(SoundMaker.MAX_VOLUME);
                SoundMaker.staticMethod();

                SoundMaker soundMaker = new Dog("Рекс", "Оварка", 30, true);
                soundMaker.makeSound();
                System.out.println(soundMaker.getSoundType());

                soundMaker.defaultMethod();


        Dog dog1 = new Dog("Рекс", "Немецкая овчарка", 28.5, true);
        Dog dog2 = new Dog("Бим", "Сеттер", 22.0, false);
        Dog dog3 = new Dog("Арчи", "Хаски", 31.0, true);

        Cat cat1 = new Cat("Барсик", "Рыжий", 15.0, true);
        Cat cat2 = new Cat("Луна", "Серый табби", 12.5, false);

        Movable[] movingAnimals = { dog1, dog2, dog3, cat1, cat2 };

        System.out.println("========== ДЕМОНСТРАЦИЯ ДВИЖЕНИЯ (Movable[]) ==========");
        for (Movable animal : movingAnimals) {
            animal.move();
        }

        SoundMaker[] soundMakers = { dog1, dog2, dog3, cat1, cat2 };

        System.out.println("\n========== ДЕМОНСТРАЦИЯ ЗВУКОВ (SoundMaker[]) ==========");
        for (SoundMaker sm : soundMakers) {
            System.out.print("[Тип звука: " + sm.getSoundType() + "] -> ");
            sm.makeSound();
        }

        Feedable[] hungryGroup = { dog1, dog2, cat1, cat2 };

        System.out.println("\n========== ДЕМОНСТРАЦИЯ КОРМЛЕНИЯ (Feedable[]) ==========");
        for (Feedable f : hungryGroup) {
            System.out.println("Животное голодно? " + (f.isHungry() ? "Да" : "Нет"));
            f.feed();
            System.out.println("Статус после кормления: " + (f.isHungry() ? "Голоден" : "Сыт"));
            System.out.println("----------------------------------------------");
        }
    }
}