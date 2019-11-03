public class Oneme {
    public static void main(String[] args) {
        Dog gaf = new Dog();
        Dog two = new Dog();
        gaf.AllData("Борис",35,"класный", "17");
        System.out.println(gaf.getALL_DAta());

        two.AllData("Лосяш",17,"white", "18");
        System.out.println(two.getALL_DAta());

        Cat meow = new Cat();
        meow.AllData(" Пушок",15," Белый"," 18");
        System.out.println(meow.getALL_DAta());

        Gopher cyclik = new Gopher();
        cyclik.AllData("Жора",8,"Коричневый","30");
        System.out.println(cyclik.getALL_DAta());

        Giraffe zhiraf = new Giraffe();
        zhiraf.AllData("Арсений",1100,"Коричневый","600");
        System.out.println(zhiraf.getALL_DAta());
    }
}