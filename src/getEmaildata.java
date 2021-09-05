import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class getEmaildata {
    getEmaildata() throws IOException {

    }

    public ArrayList<Email> getData() throws IOException {
        ArrayList<Email> data = new ArrayList<Email>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Email-EuAll.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;

            String[] array = line.split("\t");
            int from = Integer.parseInt(array[0]);
            int to = Integer.parseInt(array[1]);
            data.add(new Email(from, to));
        }
        br.close();
        return data;
    }

}
