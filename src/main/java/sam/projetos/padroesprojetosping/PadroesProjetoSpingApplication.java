package sam.projetos.padroesprojetosping;

import io.swagger.v3.oas.models.annotations.OpenAPI30;
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
