
package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig { // Napasamon Siribanjong 6410406703

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

