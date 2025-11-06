import core.*;
import storage.*;
import peripheral.*;
import base.Component;
import java.util.ArrayList;
import java.util.List;

public class PC {
    private String name;
    private Motherboard motherboard;
    private CPU cpu;
    private RAM ram;
    private List<Component> storages;
    private List<Component> peripherals;

    public PC(String name, Motherboard motherboard, CPU cpu, RAM ram) {
        this.name = name;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storages = new ArrayList<>();
        this.peripherals = new ArrayList<>();
    }

    public void addStorage(Component storage) {
        storages.add(storage);
    }

    public void addPeripheral(Component peripheral) {
        peripherals.add(peripheral);
    }

    public double calculateTotalPrice() {
        double total = motherboard.getPrice() + cpu.getPrice() + ram.getPrice();
        for (Component s : storages) total += s.getPrice();
        for (Component p : peripherals) total += p.getPrice();
        return total;
    }

    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        System.out.println("Motherboard: " + this.motherboard.getName());
        System.out.println("CPU: " + this.cpu.getName());
        System.out.println("RAM: " + this.ram.getName());
        System.out.println("Storage Components: " + this.storages.size());
        System.out.println("Peripheral Components: " + this.peripherals.size());
        System.out.println("-----------------------");
    }

    public void showConfig() {
        System.out.println("========" + name + "========");
        System.out.printf("Motherboard: %s - harga: Rp %.2f\n", motherboard.getName(), motherboard.getPrice());
        System.out.printf("CPU: %s - harga: Rp %.2f\n", cpu.getName(), cpu.getPrice());
        System.out.printf("RAM: %s - harga: Rp %.2f\n", ram.getName(), ram.getPrice());

        System.out.println("Storage:");
        if (storages.isEmpty()) {
            System.out.println("  (None)");
        } else {
            for (Component s : storages) {
                System.out.printf("  - %s - harga: Rp %.2f\n", s.getName(), s.getPrice());
            }
        }

        System.out.println("Peripherals:");
        if (peripherals.isEmpty()) {
            System.out.println("  (None)");
        } else {
            for (Component p : peripherals) {
                System.out.printf("  - %s - harga: Rp %.2f\n", p.getName(), p.getPrice());
            }
        }
        System.out.printf("TOTAL: Rp %.2f\n", calculateTotalPrice());
        System.out.println("==========================\n");
    }

    
}

