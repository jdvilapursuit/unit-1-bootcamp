
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat Garfield = new Cat("Garfield");
        Cat PinkPanther = new Cat("PinkPanther");
        Cat Catwoman = new Cat("Catwoman");

        Garfield.setFavoriteFood("Lasagna");
        Garfield.setAge(12);
        PinkPanther.setFavoriteFood("diamonds");
        PinkPanther.setAge(13);
        Catwoman.setFavoriteFood("bats");
        Catwoman.setAge(25);
    }

    public static boolean isOlder(Cat one, Cat two) {
        if (one.getAge() > two.getAge()) {
            return true;
        } else {
            return false;
        }
    }

    public static void makeBestFriends(Cat one, Cat two) {
        String favoriteFood = one.getFavoriteFood();
        two.setFavoriteFood(favoriteFood);
    }

    public static Cat makeKitten(Cat one, Cat two) {
        String kittenName = one.getName() + two.getName();
        Cat kitten = new Cat(kittenName);
        kitten.setAge(0);
        return kitten;
    }

    public static void adoption(Cat pet, Person owner) {
        if (pet.getName() == "Catwoman") {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            pet.setOwner(owner);
        }
    }

    public static boolean isFree(Cat cat) {
        if (cat.getOwner() != null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isSibling(Cat one, Cat two) {
        if (one.getOwner() == two.getOwner()) {
            return true;
        } else {
            return false;
        }
    }
}
