import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {

    public static void main(String[] args) throws IOException, FileEmptyException {
        calculateNumberOfMeasurementsIncreases();
    }

    public static int calculateNumberOfMeasurementsIncreases() throws IOException, FileEmptyException {
        File file = new File("src/main/resources/input.txt");
        isFileEmpty(file);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int counter = 0;
        int first = Integer.parseInt(bufferedReader.readLine());

        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null){
            int current = Integer.parseInt(currentLine);
            if (current > first) {
                counter++;
            }
            first = current;
        }
        System.out.println("counter is: " + counter);
        bufferedReader.close();
        return counter;
    }

    private static void isFileEmpty(File file) throws FileEmptyException{
        if (file.length() == 0){
            throw new FileEmptyException("File is empty");
        }
    }
}


