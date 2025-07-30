package JavaDocs.Operators;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    private List <Integer> list;
    private static final int SIZE = 10;

    Exceptions()
    {
        list = new ArrayList<>(SIZE);
        for(int i = 0; i < SIZE; i++){
            list.add(i);
        }
    }

    void writeLists() {
        PrintWriter pW = null;
        try {
            FileWriter fW = new FileWriter("outputFile.txt");
            pW = new PrintWriter(fW);
            for (int i = 0; i < SIZE; i++) {
                pW.println("Vaue at " + i + "=" + list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bound exception ");
        }
        catch (IOException e) {
            System.err.println("I/O Exception " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("General Exception " + e.getMessage());
        }
        pW.close();
    }
    public static void main(String[] args) {

    }
}
