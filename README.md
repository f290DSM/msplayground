# Microservices

Vamos criar um ecossitema de microserviços com Spring Boot.

Siga os Steps abaixo para que possamos construir juntos a arquitetura inicial já utilizando o `Service Discovery` e o `Edge Server`.

# Crie o diretório padrão para os microservices

```shell
mkdir microservices
cd microservices
echo "# Microservices lanscape">README.md
```

# Crie o Service Discovery para integrar os microservices

1. Crie um projeto Spring Boot com as dependecias:
* Spring Web;
* Spring Actuator;
* Netflix Eureka Server;

2. Renomeie o arquivo `application.properties` para `application.yml`.
3. Inclua as configurações abaixo, sem os comentarios:

```yaml
# Nome do microservice
spring:
  application:
    name: eurekaserver
# Porta padrão
server:
  port: 8761

# Configuração para que o microservice não se auto-registre
eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
```

4. Inclua a anotação `@EnableEurekaServer` à classe principal de seu projeto

```java
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
```

5. Execute a aplicação e abra a url `http://localhost:8761` no navegador.

# Crie o microservice para clientes

No mesmo diretório, crie o segundo microservice.

1. Crie um projeto Spring Boot com as dependecias:
* Spring Web;
* Spring Actuator;
* Netflix Eureka Client;
* JPA;
* H2;
* MySQL;
* Lombok;

2. Renomeie o arquivo `application.properties` para `application.yml`.
3. Inclua as configurações abaixo, sem os comentarios:

```yaml
spring:
  application:
    name: msclientes

# Porta com atribuicao automatica
server:
  port: 0

# Endereco para registro no Service Discovery
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka
  instance:
    instance-id: ${spring.application.name}:${spring.application.instance_id:${random.value}}

```

4. Inclua a anotação `@EnableEurekaClient` à classe principal de seu projeto

```java
@SpringBootApplication
@EnableEurekaClient
public class MsclientesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsclientesApplication.class, args);
	}
}
```

5. Acesse a url `http://localhost:8761` no navegador e verifique se a instancia de `msclientes` foi registrada no **Eureka Server**.

## Concluimos o nosso primeiro Design Pattern para Microservices, o Serice Discovery.

### Conectando microservices 

Agora que voce já verificou a conexão do `msclientes` ao `Eureka`, vamos conectar mais 2 instancias do `msclientes` à ele.

Execute os comandos abaixo.

#### Windows a partir do diretorio do msclientes

1. Segunda instância.
```shell
.\gradlew bootRun
```

2. Terceira instância.
```shell
.\gradlew bootRun
```

3. Verifique o status do `Eureka Server` com as 3 isntâncias on-line.








