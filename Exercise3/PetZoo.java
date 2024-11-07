package Exercise3;

public class PetZoo {
    public static void main(String[] args) {
        Pet cat = new Pet("Zohan");
        Pet bird = new Pet("Zara");
        Pet worm = new Pet("Zeki");

String catName = cat.getName();
String birdName = bird.getName();
String wormName = worm.getName();

for(int i=0;i<2;i++){
    System.out.println(catName);
    System.out.println(birdName);
    System.out.println(wormName);
}
    }
}
