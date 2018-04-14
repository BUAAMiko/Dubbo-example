package jj.consumer;

import jj.api.ProviderInterface;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/Beans-consumer.xml");
        context.start();
        ProviderInterface provider = context.getBean(ProviderInterface.class);
        provider.function();
        System.in.read();
    }
}
