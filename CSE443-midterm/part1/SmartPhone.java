public abstract class SmartPhone {
    protected Display display;
    protected Battery battery;
    protected CpuRam cpuRam;
    protected Storage storage;
    protected Camera camera;
    protected Case phoneCase;

    /**
     * All smart phone models will implement their own createPhone method
     */
    abstract void CreatePhone();

    @Override
    public String toString() {
        return
                "display=" + display.toString() +
                ", Battery=" + battery.toString() +
                ", CpuRam=" + cpuRam.toString() +
                ", Storage=" + storage.toString() +
                ", Camera=" + camera.toString() +
                ", Case=" + phoneCase.toString();
    }

}

