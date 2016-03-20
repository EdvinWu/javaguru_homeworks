package javaguru;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Edwin on 2016.02.17..
 */
public class ShoppingList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entry = "";
        boolean finish = false;
        ArrayList<String> shopList = new ArrayList<>();
        System.out.println("This is a shopping list application. Enter your choice:");
        menu();
        do {
            String itemAdd = "";
            entry = reader.readLine();
            switch (entry) {
                case ("1"):
                    System.out.print("Enter item to add: ");
                    itemAdd = reader.readLine();
                    shopList.add(itemAdd);
                    System.out.println(itemAdd + " added, enter your choice");
                    break;
                case ("2"):
                    for (String item : shopList) {
                        System.out.println(item);
                    }
                    System.out.println("Enter your choice");
                    break;
                case ("3"):
                    shopList.remove(reader.readLine());
                    System.out.println("Enter your choice");
                    break;
                case ("4"):
                    System.out.print("Enter file name: ");
                    Path file = Paths.get(reader.readLine() + ".txt");
                    Files.write(file, shopList, Charset.forName("UTF-8"));
                    System.out.println("Enter your choice");
                    break;
                case ("5"):
                    System.out.print("Enter a file name with format (.txt): ");
                    BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()));
                    String s;
                    while ((s = filereader.readLine()) != null) {
                        shopList.add(s);
                    }
                    break;
                case ("6"):
                    System.out.println("Bye");
                    finish = true;
                    break;
                default:
                    System.out.println("Wrong entry, here are available ones");
                    menu();
            }
        }
        while (!finish);

    }

    public static void menu() {
        System.out.println("1 - add an item");
        System.out.println("2 - list items");
        System.out.println("3 - delete an item");
        System.out.println("4 - save list to file");
        System.out.println("5 - load list from file");
        System.out.println("6 - exit");
    }
}
/*
"C:\Program Files\Java\jdk1.8.0_60\bin\java" -Didea.launcher.port=7534 "-Didea.launcher.bin.path=D:\IntelliJ IDEA Community Edition 15.0.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_60\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\rt.jar;D:\java-mars\eclipse\javaguru\out\production\javaguru;D:\IntelliJ IDEA Community Edition 15.0.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain javaGuru.javaguru.ShoppingList
This is a shopping list application. Enter your choice:
1 - add an item
2 - list items
3 - delete an item
4 - save list to file
5 - load list from file
6 - exit
1
Enter item to add: kolbasa
kolbasa added, enter your choiceр
1
Enter item to add: hleb
hleb added, enter your choice
2
kolbasa
hleb
Enter your choice
6
Bye

Process finished with exit code 0
*/
