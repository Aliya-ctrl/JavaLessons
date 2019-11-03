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
    }
}