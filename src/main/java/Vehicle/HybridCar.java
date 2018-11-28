package Vehicle;

import Behaviours.IAssemble;
import Parents.Vehicle;

public class HybridCar extends Vehicle implements IAssemble {

    //instance
    private IAssemble assembly;

    //constructor
    public HybridCar(double price, String colour, IAssemble assembly) {
        super(price, colour);
        this.assembly = assembly;
    }

    //inherit from vehicle (price, colour)
    //includes engine/tyre

    //methods
    public String getAssembly(String data) {
        return this.assembly.getAssembly(data);
    }

    public void setAssemlyComponent(IAssemble assembly) {
        this.assembly = assembly;
    }
}
