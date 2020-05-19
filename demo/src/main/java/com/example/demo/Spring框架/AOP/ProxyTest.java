package com.example.demo.Spring框架.AOP;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author Huang xing yuan
 * @date 2020-05-06-11:35
 */
public class ProxyTest {

    public static Bork getProxy(final Bork bork) {
        Bork proxy = (Bork) Proxy.newProxyInstance(bork.getClass().getClassLoader(), bork.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if ("getBork2".equals(method.getName())) {
                    Thread.sleep(2000);
                    System.out.println("休息10分钟");
                }
                return method.invoke(bork, objects);
            }
        });
        return proxy;
    }

    @Test
    public void get(){
        Bork bork = new People();
        Bork proxy = getProxy(bork);
        proxy.getBork1();
        proxy.getBork2();
    }
}
