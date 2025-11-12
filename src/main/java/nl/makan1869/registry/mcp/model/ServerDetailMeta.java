package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Extension metadata using reverse DNS namespacing for vendor-specific data
 */

@Schema(name = "ServerDetail__meta", description = "Extension metadata using reverse DNS namespacing for vendor-specific data")
@JsonTypeName("ServerDetail__meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerDetailMeta implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private Map<String, Object> ioModelcontextprotocolRegistryPublisherProvided = new HashMap<>();

  public ServerDetailMeta ioModelcontextprotocolRegistryPublisherProvided(Map<String, Object> ioModelcontextprotocolRegistryPublisherProvided) {
    this.ioModelcontextprotocolRegistryPublisherProvided = ioModelcontextprotocolRegistryPublisherProvided;
    return this;
  }

  public ServerDetailMeta putIoModelcontextprotocolRegistryPublisherProvidedItem(String key, Object ioModelcontextprotocolRegistryPublisherProvidedItem) {
    if (this.ioModelcontextprotocolRegistryPublisherProvided == null) {
      this.ioModelcontextprotocolRegistryPublisherProvided = new HashMap<>();
    }
    this.ioModelcontextprotocolRegistryPublisherProvided.put(key, ioModelcontextprotocolRegistryPublisherProvidedItem);
    return this;
  }

  /**
   * Publisher-provided metadata for downstream registries
   * @return ioModelcontextprotocolRegistryPublisherProvided
   */
  
  @Schema(name = "io.modelcontextprotocol.registry/publisher-provided", example = "{tool=publisher-cli, version=1.2.3, buildInfo={commit=abc123def456, timestamp=2023-12-01T10:30:00Z, pipelineId=build-789}}", description = "Publisher-provided metadata for downstream registries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("io.modelcontextprotocol.registry/publisher-provided")
  public Map<String, Object> getIoModelcontextprotocolRegistryPublisherProvided() {
    return ioModelcontextprotocolRegistryPublisherProvided;
  }

  public void setIoModelcontextprotocolRegistryPublisherProvided(Map<String, Object> ioModelcontextprotocolRegistryPublisherProvided) {
    this.ioModelcontextprotocolRegistryPublisherProvided = ioModelcontextprotocolRegistryPublisherProvided;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerDetailMeta serverDetailMeta = (ServerDetailMeta) o;
    return Objects.equals(this.ioModelcontextprotocolRegistryPublisherProvided, serverDetailMeta.ioModelcontextprotocolRegistryPublisherProvided);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioModelcontextprotocolRegistryPublisherProvided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerDetailMeta {\n");
    sb.append("    ioModelcontextprotocolRegistryPublisherProvided: ").append(toIndentedString(ioModelcontextprotocolRegistryPublisherProvided)).append("\n");
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

