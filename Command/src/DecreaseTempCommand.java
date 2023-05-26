public class DecreaseTempCommand implements ICommand
{
    private Chauffage chauffage;

    public DecreaseTempCommand(Chauffage chauffage)
    {
        this.chauffage = chauffage;
    }

    public void execute()
    {
        this.chauffage.decreaseTemp();
    }
}
