package cz.itnetwork.ASCIITable;

public class ASCIITable {

    public static void main(String[] args) {
        System.out.println("ASCII Table");
        System.out.println("=============");
        for (int i = 33; i < 256; i++) {
            char character = (char) i;
            System.out.println(i + ":" + character);
        }
    }

}
