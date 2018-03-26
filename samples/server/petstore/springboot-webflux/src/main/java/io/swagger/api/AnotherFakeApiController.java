package io.swagger.api;

import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Controller
public class AnotherFakeApiController implements AnotherFakeApi {
    private final ObjectMapper objectMapper;

    public AnotherFakeApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
