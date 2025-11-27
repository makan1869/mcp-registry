package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import nl.makan1869.registry.mcp.model.ServerDetail;
import nl.makan1869.registry.mcp.model.ServerResponseMeta;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * API response format with separated server data and registry metadata
 */

@Schema(name = "ServerResponse", description = "API response format with separated server data and registry metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private ServerDetail server;

  private ServerResponseMeta meta;

  public ServerResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerResponse(ServerDetail server, ServerResponseMeta meta) {
    this.server = server;
    this.meta = meta;
  }

  public ServerResponse server(ServerDetail server) {
    this.server = server;
    return this;
  }

  /**
   * Get server
   * @return server
   */
  @NotNull @Valid 
  @Schema(name = "server", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("server")
  public ServerDetail getServer() {
    return server;
  }

  public void setServer(ServerDetail server) {
    this.server = server;
  }

  public ServerResponse meta(ServerResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @NotNull @Valid 
  @Schema(name = "_meta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_meta")
  public ServerResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ServerResponseMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerResponse serverResponse = (ServerResponse) o;
    return Objects.equals(this.server, serverResponse.server) &&
        Objects.equals(this.meta, serverResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(server, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerResponse {\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

