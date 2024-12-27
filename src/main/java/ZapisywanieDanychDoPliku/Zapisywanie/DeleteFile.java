package ZapisywanieDanychDoPliku.Zapisywanie;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if(file.delete()){
            System.out.println("Usunieto plik");
        }else{
            System.out.println("Nie działa");
        }
    }

}
