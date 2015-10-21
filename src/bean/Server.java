package bean;

import java.net.InetAddress;

/**
 * Created by ${Dotin} on ${4/25/2015}.
 */
public class Server {
    private InetAddress ip;
    private Integer port;

    public Server() {
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public InetAddress getIp() {
        return ip;
    }

    public void setIp(InetAddress ip) {
        this.ip = ip;
    }
}
