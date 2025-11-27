package nl.makan1869.registry.controller;

import nl.makan1869.registry.mcp.api.V0Api;
import nl.makan1869.registry.mcp.model.ServerList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import jakarta.validation.Valid;

import java.time.OffsetDateTime;

/**
 * Home redirection to OpenAPI api documentation
 */
@Controller
public class V0APIController implements V0Api {

    @Override
    public ResponseEntity<ServerList> v0ServersGet(
            @Valid @RequestParam(value = "cursor", required = false) @Nullable String cursor,
            @Valid @RequestParam(value = "limit", required = false) @Nullable Integer limit,
            @Valid @RequestParam(value = "search", required = false) @Nullable String search,
            @Valid @RequestParam(value = "updated_since", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Nullable OffsetDateTime updatedSince,
            @Valid @RequestParam(value = "version", required = false) @Nullable String version) {
        // TODO: Implement actual server listing logic
        ServerList serverList = new ServerList();
        return ResponseEntity.ok(serverList);
    }

}