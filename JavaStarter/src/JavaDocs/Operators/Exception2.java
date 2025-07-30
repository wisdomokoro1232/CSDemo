package JavaDocs.Operators;

import java.io.*;
import java.util.*;

public class Exception2 {
    private List<Integer> list;
    private static final int SIZE =10;

    Exception2() {
        list=new ArrayList<>(SIZE);
        for(int i =0; i<SIZE; i++)
        {
            list.add(i);
        }
    }

    public void writeList() throws IOException, IndexOutOfBoundsException
    {
        try(PrintWriter pW = new PrintWriter(new FileWriter("outputfile.txt")))
        {

        }
    }
}
