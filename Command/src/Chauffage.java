//Receiver
public class Chauffage
{
    private boolean state = false;

    private int currentTemp = 0;

    public void on()
    {
        this.state = true;
    }

    public void off()
    {
        this.state = false;
    }

    public String toString()
    {
        return this.state ? "Le chauffage est allumé, la température est de : " + currentTemp + "°" : "Le chauffage " +
                "est éteint la température est de " + currentTemp + "°";
    }

    public void increaseTemp()
    {
        this.currentTemp += 1;
        System.out.println("J'augmente la témpérature");
    }

    public void decreaseTemp()
    {
        this.currentTemp -= 1;
        System.out.println("Je descends la température");
    }



}
