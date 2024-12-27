package ZapisywanieDanychDoPliku.Zapisywanie;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        writer.write("new tekst");
        writer.close();
    }
}
