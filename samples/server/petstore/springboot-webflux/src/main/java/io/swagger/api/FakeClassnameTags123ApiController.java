package io.swagger.api;

import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Controller
public class FakeClassnameTags123ApiController implements FakeClassnameTags123Api {
    private final ObjectMapper objectMapper;

    public FakeClassnameTags123ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
