import java.util.Objects;

public class Puppy {
    public static void main(String[] args) {
        Dog puppy = new Dog("Puppy", Breed.LABRADOR, 3);
        Dog puppy2 = new Dog("Puppy", Breed.BULLDOG, 15);
        Dog puppy3 = new Dog("Puppy", Breed.LABRADOR, 2);
        if (puppy.equals(puppy2) || puppy.equals(puppy3) || puppy2.equals(puppy3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Dog max = puppy2;
        if (puppy.age > puppy2.age && puppy.age > puppy3.age) max = puppy;
        if (puppy3.age > puppy2.age && puppy3.age > puppy.age) max = puppy3;
        System.out.println("Oldest dog " + max);
    }

    public enum Breed {
        LABRADOR,
        BEAGLE,
        GERMAN_SHEPHERD,
        POODLE,
        BULLDOG,
    }

    public static class Dog {
        private String name;
        private Breed breed;
        private int age;

        public Dog(String name, Breed breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, breed, age);
        }

        @Override
        public String toString() {
            return "name is '" + name + '\'' +
                    ", breed is " + breed +
                    ", age was " + age;
        }
    }
}
