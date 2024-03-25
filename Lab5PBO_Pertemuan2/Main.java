public class Main {
        public static void main(String[] args){
            Human Ligma = new Human();
            Ligma.sayHello();


//       OWL
            Bird Owl = new Bird("Owl",3.1,"White");
            System.out.println(Owl.featherColor);
            System.out.println(Owl.weight);

            Owl.walk();
            Owl.walk();
            Owl.eat();
            System.out.println(Owl.getWeight());

            System.out.println("\n\n");
//        PIGEON
            Bird Pigeon = new Bird("Pigeon", 4.2, "Grey");
            System.out.println(Pigeon.featherColor);
            System.out.println(Pigeon.weight);

            Pigeon.walk();
            Pigeon.walk();
            Pigeon.eat();
            System.out.println(Pigeon.getWeight());


        }
}

