package cb.vertex.tax;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HelloService {


    public ResponseEntity getHello() throws StreamReadException, DatabindException, IOException{
        ObjectMapper mapper = new ObjectMapper();

        Object someClassObject = mapper.readValue(new ClassPathResource("hello.json").getFile(), Object.class);


        return new ResponseEntity<>(someClassObject,HttpStatus.OK);
    }


    
}
