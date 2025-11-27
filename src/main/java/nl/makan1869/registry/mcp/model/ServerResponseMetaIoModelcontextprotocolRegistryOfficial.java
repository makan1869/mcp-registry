package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
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
 * Official MCP registry metadata
 */

@Schema(name = "ServerResponse__meta_io_modelcontextprotocol_registry_official", description = "Official MCP registry metadata")
@JsonTypeName("ServerResponse__meta_io_modelcontextprotocol_registry_official")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerResponseMetaIoModelcontextprotocolRegistryOfficial implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Server lifecycle status
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    DEPRECATED("deprecated"),
    
    DELETED("deleted");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime publishedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updatedAt;

  private @Nullable Boolean isLatest;

  public ServerResponseMetaIoModelcontextprotocolRegistryOfficial status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Server lifecycle status
   * @return status
   */
  
  @Schema(name = "status", example = "active", description = "Server lifecycle status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public ServerResponseMetaIoModelcontextprotocolRegistryOfficial publishedAt(@Nullable OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Timestamp when the server was first published to the registry
   * @return publishedAt
   */
  @Valid 
  @Schema(name = "publishedAt", example = "2023-12-01T10:30:00Z", description = "Timestamp when the server was first published to the registry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishedAt")
  public @Nullable OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(@Nullable OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ServerResponseMetaIoModelcontextprotocolRegistryOfficial updatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the server entry was last updated
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", example = "2023-12-01T11:00:00Z", description = "Timestamp when the server entry was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public @Nullable OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ServerResponseMetaIoModelcontextprotocolRegistryOfficial isLatest(@Nullable Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

  /**
   * Whether this is the latest version of the server
   * @return isLatest
   */
  
  @Schema(name = "isLatest", example = "true", description = "Whether this is the latest version of the server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLatest")
  public @Nullable Boolean getIsLatest() {
    return isLatest;
  }

  public void setIsLatest(@Nullable Boolean isLatest) {
    this.isLatest = isLatest;
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
    public ServerResponseMetaIoModelcontextprotocolRegistryOfficial putAdditionalProperty(String key, Object value) {
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
    ServerResponseMetaIoModelcontextprotocolRegistryOfficial serverResponseMetaIoModelcontextprotocolRegistryOfficial = (ServerResponseMetaIoModelcontextprotocolRegistryOfficial) o;
    return Objects.equals(this.status, serverResponseMetaIoModelcontextprotocolRegistryOfficial.status) &&
        Objects.equals(this.publishedAt, serverResponseMetaIoModelcontextprotocolRegistryOfficial.publishedAt) &&
        Objects.equals(this.updatedAt, serverResponseMetaIoModelcontextprotocolRegistryOfficial.updatedAt) &&
        Objects.equals(this.isLatest, serverResponseMetaIoModelcontextprotocolRegistryOfficial.isLatest) &&
    Objects.equals(this.additionalProperties, serverResponseMetaIoModelcontextprotocolRegistryOfficial.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, publishedAt, updatedAt, isLatest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerResponseMetaIoModelcontextprotocolRegistryOfficial {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    
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

