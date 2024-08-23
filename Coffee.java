public class Coffee extends Beverages{
    @Override
    void boilWater() {
        System.out.println("Boiling water");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    @Override
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }
    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
    }

}
