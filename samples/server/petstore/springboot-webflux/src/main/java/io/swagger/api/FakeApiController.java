package io.swagger.api;

import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Controller
public class FakeApiController implements FakeApi {
    private final ObjectMapper objectMapper;

    public FakeApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}