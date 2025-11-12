package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * V0PublishPost500Response
 */

@JsonTypeName("_v0_publish_post_500_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class V0PublishPost500Response implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String error;

  public V0PublishPost500Response error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", example = "Failed to publish server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    V0PublishPost500Response v0PublishPost500Response = (V0PublishPost500Response) o;
    return Objects.equals(this.error, v0PublishPost500Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0PublishPost500Response {\n");
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

