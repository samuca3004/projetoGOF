package sam.projetos.padroesprojetosping;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PadroesProjetoSpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpingApplication.class, args);
	}

}
