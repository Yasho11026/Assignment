public abstract class Beverages {

    private boolean wantsExtras;
    public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }

    abstract void boilWater();
    abstract void pourInCup();
    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();
    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras){
            addExtras();
        }
    }
}
