package jj.provider;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/Beans.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.in.read();
    }
}
