package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * V0ServersServerNameVersionsVersionDelete500Response
 */

@JsonTypeName("_v0_servers__serverName__versions__version__delete_500_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class V0ServersServerNameVersionsVersionDelete500Response implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String error;

  public V0ServersServerNameVersionsVersionDelete500Response error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", example = "Failed to delete server version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  public void setError(@Nullable String error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0ServersServerNameVersionsVersionDelete500Response v0ServersServerNameVersionsVersionDelete500Response = (V0ServersServerNameVersionsVersionDelete500Response) o;
    return Objects.equals(this.error, v0ServersServerNameVersionsVersionDelete500Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0ServersServerNameVersionsVersionDelete500Response {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

