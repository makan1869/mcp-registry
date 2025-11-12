package nl.makan1869.registry.mcp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
@Controller
@RequestMapping("${openapi.mcp-registry.base-path:}")
public class V0ApiController implements V0Api {

    private final NativeWebRequest request;

    @Autowired
    public V0ApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
