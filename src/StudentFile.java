import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile {
    public void writerFile(String path, List<Student> students) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ID" + "," + "Age" + "," + "Name" + "," + "Gender" + "," + "Address" + "," + "School");
        bw.write("\n");
        for (int i = 0; i < students.size(); i++) {
            bw.write(students.get(i).getId() + "," + students.get(i).getAge() + "," + students.get(i).getName()
                    + "," + students.get(i).getGender() + "," + students.get(i).getAddress() + "," + students.get(i).getSchool() + "\n");
        }
        bw.close();
        fw.close();
    }

    public static List<String> parseCsvLine(String csvLine){
        List<String> list = new ArrayList<>();

        if (csvLine != null){
            String[] strings = csvLine.split(",");
            for (int i = 0; i < strings.length; i++) {
                list.add(strings[i]);
            }
        }
        return list;
    }
    public void readFile(){
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("abc.csv"));
            while ((line = br.readLine()) != null){
                System.out.println(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
