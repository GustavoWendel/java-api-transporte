package br.com.teste.java.client;

import br.com.teste.java.testebackend.domain.Line;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class SpringClient {
    public static void main(String[] args) {
        ResponseEntity<Line> entity = new RestTemplate().getForEntity("http://localhost:8080/linhas/2", Line.class, 2);
        log.info(entity);

        Line object = new RestTemplate().getForObject("http://localhost:8080/linhas/{id}", Line.class, 2);

        log.info(object);
    }
}
