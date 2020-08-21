package org.test.invoker;

import com.sun.tools.javac.util.ServiceLoader;
import org.test.junjie.IPrinter;

/**
 * @ https://www.cnkirito.moe/spi/ 可以查看详细的关于SPI的介绍
 */
public class TestMain {
    public static void main(String[] args) {

        ServiceLoader<IPrinter> serviceLoader = ServiceLoader.load(IPrinter.class);
        for (IPrinter iPrinter : serviceLoader) {
            iPrinter.print();
        }
    }
}
