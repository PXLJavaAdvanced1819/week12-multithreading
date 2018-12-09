package be.pxl.multithreading.opdracht1;

import java.nio.file.*;

public class IpAddressesProcessor {
    public static void main(String[] args) {
        long result = new NumberCounter(Paths.get("resources/testdata/ip_addresses_20181201.csv"), 130).countNumberInFile();
        System.out.println(result);
    }
}
