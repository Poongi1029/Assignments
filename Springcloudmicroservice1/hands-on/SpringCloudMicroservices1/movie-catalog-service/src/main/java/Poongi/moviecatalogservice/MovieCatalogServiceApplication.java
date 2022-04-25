package Poongi.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
public class MovieCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return  new RestTemplate();
	}
	@Bean
	public WebClient.Builder getwebclientBuilder(){
		return  WebClient.builder();
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}

