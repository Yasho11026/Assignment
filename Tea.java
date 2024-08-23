public class Tea extends Beverages{

    @Override
    void boilWater() {
        System.out.println("Boiling water");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addExtras() {
        System.out.println("Add extra tea condiments");
    }
}
