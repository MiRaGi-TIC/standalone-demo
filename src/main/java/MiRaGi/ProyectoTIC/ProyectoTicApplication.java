package MiRaGi.ProyectoTIC;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProyectoTicApplication {
	public static ConfigurableApplicationContext context;

	public static void main(final String[] args) {
		context = SpringApplication.run(ProyectoTicApplication.class);
		Application.launch(Pantalla.class, args);
	}
}
