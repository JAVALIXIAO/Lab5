package zuoye;

import java.io.*;

public class Output extends Students{


    public static void main(String[] args) {
        Students stu1 = new Students();
        stu1.name="李华";
        stu1.id=2017311515;
        stu1.gender="女";
        stu1.age=18;
      
        try(FileReader reader = new FileReader("D:\\111\\文本文件-B.txt");
            FileWriter writer = new FileWriter("D:\\111\\文本文件-A.txt")
        ){
            StringBuffer sb = new StringBuffer();
            char[] cs = new char[14];
            while ((reader.read(cs)) != -1) {
                sb.append(cs , 0, 7);
                sb.append(", ");
                sb.append(cs, 7, 7);
                sb.append(". "+"\n");
            }
            System.out.println(sb);
            writer.write(stu1.toString());
            writer.write("\n");
            writer.write(new String(sb));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
