import core.*;
import storage.*;
import base.*;
import peripheral.*;

public class Main {
    public static void main(String[] args) {
        PC gamingPC = PCBuilder.buildGamingPC();
        gamingPC.showConfig();
        
        PCReportGenerator reportGenerator = new PCReportGenerator();
        reportGenerator.generateReport(gamingPC);
        
        System.out.println("Laporan selesai.");
    }
}