public class Main {
    public static void main(String[] args)
    {
        Chauffage chauffage = new Chauffage();

        ICommand increase = new IncreaseTempCommand(chauffage);

        ICommand decrease = new DecreaseTempCommand(chauffage);

        RemoteController telecommande = new RemoteController();
        telecommande.addCommand("increase", increase);
        telecommande.addCommand("decrease", decrease);

        System.out.println(chauffage.toString());

        chauffage.on();
        System.out.println(chauffage.toString());

        chauffage.off();
        System.out.println(chauffage.toString());

        chauffage.on();
        
        telecommande.execute("increase");
        System.out.println(chauffage.toString());

        telecommande.execute("decrease");
        System.out.println(chauffage.toString());

    }
}