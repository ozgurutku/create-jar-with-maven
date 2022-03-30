package ozgur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        File file = new File("target/city.txt");

        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    list = Arrays.asList(line.split("\\s*,\\s*"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
