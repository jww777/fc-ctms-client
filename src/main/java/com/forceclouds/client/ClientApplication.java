package com.forceclouds.client;

import com.forceclouds.client.socket.server.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: jww
 * @CreateDate: 2019/4/17 14:39
 */
@SpringBootApplication
public class ClientApplication  implements CommandLineRunner {

    @Value("${n.port}")
    private int port;

    @Value("${n.url}")
    private String url;

    @Autowired
    private NettyServer socketServer;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }

    @Override
    public void run(String... strings) {
/*        InetSocketAddress address = new InetSocketAddress(url, port);
        ChannelFuture future = socketServer.run(address);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                socketServer.destroy();
            }
        });
        future.channel().closeFuture().syncUninterruptibly();*/



    }
}
