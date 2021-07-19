/*
 * @author Jonathan Santiago
 * Traffic Light Setup (using Java SE 15)
 * July 18th, 2021
 */

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Light light = Light.RED;
        TrafficLight trafficLight = new TrafficLight(light);
        trafficLight.displayLight();
        trafficLight.changeLight();
        trafficLight.changeLight();
    }
}