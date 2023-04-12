package gateway_server_14000;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class GatewayServer14000Application{
    public static void main(String[] args) {
        SpringApplication.run(GatewayServer14000Application.class, args);
    }
}
