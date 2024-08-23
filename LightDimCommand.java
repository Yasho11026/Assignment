public class LightDimCommand implements Command{
    private Light light;
    private int Brightness;
    private final int newBrightness;
    public LightDimCommand(Light light,int newBrightness){
        this.light = light;
        this.newBrightness = newBrightness;
    }
    @Override
    public void execute() {
        Brightness = light.getBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(Brightness);
    }
}
