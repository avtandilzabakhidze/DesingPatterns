package pattern.structural.facade;

public class Demo {
    public static void main(String[] args) {
        ComputerFacade facade  = new ComputerFacade(new CPU(),new HardDrive(),new Memory());
        facade.startComputer();
        facade.endComputer();
    }
}
