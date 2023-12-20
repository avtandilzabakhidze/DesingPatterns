package pattern.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(CPU cpu, HardDrive hardDrive, Memory memory) {
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public void startComputer(){
        cpu.startCPU();
        hardDrive.readDrive();
        memory.loadMemory();
    }

    public void endComputer(){
        cpu.endCPU();
        hardDrive.write();
        memory.clearMemory();
    }
}
