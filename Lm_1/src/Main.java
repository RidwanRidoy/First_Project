public class Main {
    public static void main(String[] args) {

       //Item Class
        Item item = new Item("Name of the Item", "description of the item", 10);
        System.out.println(item);

        //Gold Class
        Gold goldBar = new Gold("City Gold", 50 );
        System.out.println(goldBar);

        //Weapon Class
        Weapon magicSword = new Weapon("Magic_Sword","Sharp cutter", 5, 7 );
        System.out.println(magicSword);
        //Sword Class
        Sword sword = new Sword();
        System.out.println(sword);

        //Pillow Class
        Pillow pillow = new Pillow();
        System.out.println(pillow);

        //Mace Class
        Mace bigMace = new Mace();
        System.out.println(bigMace);

        //Arrow Class
        Arrow sharpArrow = new Arrow();
        System.out.println(sharpArrow);



    }
}