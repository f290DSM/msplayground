package br.com.fatecararas.msclientes.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DomainConfig {

    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }
}
