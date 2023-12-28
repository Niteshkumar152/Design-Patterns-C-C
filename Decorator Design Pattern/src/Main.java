public class Main {
    public static void main(String[] args) {
        BasePizza marg_extra_cheese = new ExtraCheese(new Margherita());
        System.out.println(marg_extra_cheese.cost());

        System.out.println(new Mushroom(marg_extra_cheese).cost());
    }
}