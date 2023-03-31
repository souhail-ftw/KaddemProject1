package tn.ey.dev.kaddemproject.Config;

public class SwaggerConfig {import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class SwaggerConfig {
        @Bean
        public OpenAPI springShopOpenAPI() {
            return new OpenAPI()
                    .info(infoAPI());
        }
        public Info infoAPI() {
            return new Info().title("SpringDoc-Demo")
                    .description("TP étude de cas")
                    .contact(contactAPI());

        }
        public Contact contactAPI() {
            Contact contact = new Contact().name("Asma")
                    .email("asma.trabelsi@esprit.tn")
                    .url("https://www.linkedin.com/in/asma-trabelsi149/");
            return contact;
        }
    }
}
