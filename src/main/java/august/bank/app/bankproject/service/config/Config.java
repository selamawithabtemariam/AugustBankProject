package august.bank.app.bankproject.service.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
public class Config {


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
