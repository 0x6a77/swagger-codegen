package io.swagger.api;

import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Controller
public class StoreApiController implements StoreApi {
    private final ObjectMapper objectMapper;

    public StoreApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
