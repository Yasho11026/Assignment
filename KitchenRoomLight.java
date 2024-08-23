public class KitchenRoomLight implements Light{
    private int Brightness;
    @Override
    public void on() {
        Brightness = 100;
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        Brightness = 0;
        System.out.println("Kitchen Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        Brightness = level;
        System.out.println("Kitchen Room light dimmed to "+ Brightness +"%");
    }

    public int getBrightness() {
        return Brightness;
    }
}
