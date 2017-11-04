package io.swagger.api;

import io.swagger.model.Client;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Controller
public class FakeClassnameTags123ApiController implements FakeClassnameTags123Api {
    private final ObjectMapper objectMapper;

    public FakeClassnameTags123ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Client> testClassname(@ApiParam(value = "client model" ,required=true )   @RequestBody Client body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Client>(objectMapper.readValue("{  \"client\" : \"client\"}", Client.class), HttpStatus.OK);
        }

        return new ResponseEntity<Client>(HttpStatus.OK);
    }

}
