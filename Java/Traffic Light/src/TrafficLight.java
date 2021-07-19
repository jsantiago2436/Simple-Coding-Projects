enum Light {
    RED, YELLOW, GREEN;
}

public class TrafficLight {
    Light light;
    
    public TrafficLight(Light light) {
        this.light = light;
    }
    
    public void changeLight() throws InterruptedException {
        switch(light){
            case GREEN:
                switchToYellow();
                light = Light.RED;
                System.out.println(light);
                break;
            case RED:
                light = Light.GREEN;
                System.out.println(light);
                break;
        }
    }
    private void switchToYellow() throws InterruptedException {
        light = Light.YELLOW;
        System.out.println(light);
        Thread.sleep(1000); //average time for a light to shift from yellow to red
    }
    
    public void displayLight() {
        System.out.println(light);
    }
}