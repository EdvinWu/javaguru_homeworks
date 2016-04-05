package javaguru.procedural;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.18..
 */
public class Symmetric {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entry = reader.readLine();
        String symmetrical = swap(entry);
        if (entry.equals(symmetrical)) {
            System.out.println("Symmetrical");
        } else {
            System.out.println("Not symmetrical");
        }
        //System.out.println(swap(entry));
    }

    public static String swap(String entry) {
        if (entry.length() <= 1) {
            return entry;
        }
        return swap(entry.substring(1)) + entry.substring(0, 1);
    }
}
/*
"C:\Program Files\Java\jdk1.8.0_60\bin\java" -Didea.launcher.port=7535 "-Didea.launcher.bin.path=D:\IntelliJ IDEA Community Edition 15.0.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_60\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\rt.jar;D:\java-mars\eclipse\javaguru\out\production\javaguru;D:\IntelliJ IDEA Community Edition 15.0.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain javaGuru.javaguru.procedural.Symmetric
oppa
Not symmetrical
Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_60\bin\java" -Didea.launcher.port=7536 "-Didea.launcher.bin.path=D:\IntelliJ IDEA Community Edition 15.0.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_60\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\rt.jar;D:\java-mars\eclipse\javaguru\out\production\javaguru;D:\IntelliJ IDEA Community Edition 15.0.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain javaGuru.javaguru.procedural.Symmetric
oppo
Symmetrical
Process finished with exit code 0

 */