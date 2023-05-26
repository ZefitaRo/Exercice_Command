public class IncreaseTempCommand implements ICommand
{
    private Chauffage chauffage;

    public IncreaseTempCommand(Chauffage chauffage)
    {
        this.chauffage = chauffage;
    }

    public void execute()
    {
        this.chauffage.increaseTemp();
    }

}
