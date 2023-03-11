package cb.vertex.tax;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    
    @Autowired
    private HelloService helloService;


    @GetMapping("/hello")
    public ResponseEntity hello() throws StreamReadException, DatabindException, IOException{
        return helloService.getHello();
    }
}
