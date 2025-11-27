package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.makan1869.registry.mcp.model.ServerListMetadata;
import nl.makan1869.registry.mcp.model.ServerResponse;
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
 * ServerList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerList implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid ServerResponse> servers = new ArrayList<>();

  private @Nullable ServerListMetadata metadata;

  public ServerList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerList(List<@Valid ServerResponse> servers) {
    this.servers = servers;
  }

  public ServerList servers(List<@Valid ServerResponse> servers) {
    this.servers = servers;
    return this;
  }

  public ServerList addServersItem(ServerResponse serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<>();
    }
    this.servers.add(serversItem);
    return this;
  }

  /**
   * Get servers
   * @return servers
   */
  @NotNull @Valid 
  @Schema(name = "servers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("servers")
  public List<@Valid ServerResponse> getServers() {
    return servers;
  }

  public void setServers(List<@Valid ServerResponse> servers) {
    this.servers = servers;
  }

  public ServerList metadata(@Nullable ServerListMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public @Nullable ServerListMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(@Nullable ServerListMetadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerList serverList = (ServerList) o;
    return Objects.equals(this.servers, serverList.servers) &&
        Objects.equals(this.metadata, serverList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerList {\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

