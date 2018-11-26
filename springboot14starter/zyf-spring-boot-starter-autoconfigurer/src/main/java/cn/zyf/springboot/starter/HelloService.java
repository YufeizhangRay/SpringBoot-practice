package cn.zyf.springboot.starter;

public class HelloService {


    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String hello(String string){
        return helloProperties.getPrefix()+"--"+string;
    }
}
