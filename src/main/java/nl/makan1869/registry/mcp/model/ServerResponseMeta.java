package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import nl.makan1869.registry.mcp.model.ServerResponseMetaIoModelcontextprotocolRegistryOfficial;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Registry-managed metadata
 */

@Schema(name = "ServerResponse__meta", description = "Registry-managed metadata")
@JsonTypeName("ServerResponse__meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerResponseMeta implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable ServerResponseMetaIoModelcontextprotocolRegistryOfficial ioModelcontextprotocolRegistryOfficial;

  public ServerResponseMeta ioModelcontextprotocolRegistryOfficial(@Nullable ServerResponseMetaIoModelcontextprotocolRegistryOfficial ioModelcontextprotocolRegistryOfficial) {
    this.ioModelcontextprotocolRegistryOfficial = ioModelcontextprotocolRegistryOfficial;
    return this;
  }

  /**
   * Get ioModelcontextprotocolRegistryOfficial
   * @return ioModelcontextprotocolRegistryOfficial
   */
  @Valid 
  @Schema(name = "io.modelcontextprotocol.registry/official", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("io.modelcontextprotocol.registry/official")
  public @Nullable ServerResponseMetaIoModelcontextprotocolRegistryOfficial getIoModelcontextprotocolRegistryOfficial() {
    return ioModelcontextprotocolRegistryOfficial;
  }

  public void setIoModelcontextprotocolRegistryOfficial(@Nullable ServerResponseMetaIoModelcontextprotocolRegistryOfficial ioModelcontextprotocolRegistryOfficial) {
    this.ioModelcontextprotocolRegistryOfficial = ioModelcontextprotocolRegistryOfficial;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public ServerResponseMeta putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerResponseMeta serverResponseMeta = (ServerResponseMeta) o;
    return Objects.equals(this.ioModelcontextprotocolRegistryOfficial, serverResponseMeta.ioModelcontextprotocolRegistryOfficial) &&
    Objects.equals(this.additionalProperties, serverResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioModelcontextprotocolRegistryOfficial, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerResponseMeta {\n");
    sb.append("    ioModelcontextprotocolRegistryOfficial: ").append(toIndentedString(ioModelcontextprotocolRegistryOfficial)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

