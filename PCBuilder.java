import core.*;
import storage.*;
import peripheral.*;
import base.Component;

public class PCBuilder {
    
    public static PC buildGamingPC() {
        PC pc = new PC("Gaming PC", 
                new Motherboard("ASUS ROG", 2000000),
                new CPU("Intel i7", 2500000),
                new RAM("Corsair 32GB", 950000));
        
        pc.addStorage(new SSD("Samsung 1TB", 1500000));
        pc.addPeripheral(new Mouse("Logitech", 250000));
        pc.addPeripheral(new Keyboard("Corsair", 400000));
        
        return pc;
    }
}