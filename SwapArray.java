package javaguru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.18..
 */
public class SwapArray {
    public static void main(String[] args) throws IOException {
        int[] mas = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean finish = false;
        for (int j = 0; j < mas.length; j++) {
            mas[j] = j + 1;
        }
        System.out.println("mas already exists. 1 - print mas. 2 - swap mas. 9 - exit");
        do{
            String entry = reader.readLine();
            switch (entry){
                case "1":
                    printMas(mas);
                    break;
                case "2":
                    swapMas(mas);
                    System.out.println("mas swapped");
                    break;
                case "9":
                    System.out.println("Bye");
                    finish = true;
                    break;
                default:
                    System.out.println("Wrong entry. 1 - print mas. 2 - swap mas. 9 - exit");
            }
        } while(!finish);
    }
    public static void printMas(int[] mas){
        for (int j = 0; j < mas.length; j++) {
            System.out.print(mas[j] + " ");
        }
    }
    public static void swapMas(int[] mas){
        int a;
        int i = 0;
        do {
            a = mas[i];
            int b = mas[mas.length - 1 - i];
            mas[i] = b;
            mas[mas.length - 1 - i] = a;
            i++;
        } while (i != mas.length - i);
    }
}
/*
"C:\Program Files\Java\jdk1.8.0_60\bin\java" -Didea.launcher.port=7547 "-Didea.launcher.bin.path=D:\IntelliJ IDEA Community Edition 15.0.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_60\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\rt.jar;D:\java-mars\eclipse\javaguru\out\production\javaguru;D:\IntelliJ IDEA Community Edition 15.0.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain javaGuru.javaguru.SwapArray
mas already exists. 1 - print mas. 2 - swap mas. 9 - exit
1
1 2 3 4 5 6 7 8 9 10 2
mas swapped
1
10 9 8 7 6 5 4 3 2 1 9
Bye

Process finished with exit code 0
*/