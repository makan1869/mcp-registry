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
 * ServerListMetadata
 */

@JsonTypeName("ServerList_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerListMetadata implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String nextCursor;

  private @Nullable Integer count;

  public ServerListMetadata nextCursor(@Nullable String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * Pagination cursor for retrieving the next page of results. Use this exact value in the `cursor` query parameter of your next request. If null or empty, there are no more results. 
   * @return nextCursor
   */
  
  @Schema(name = "nextCursor", description = "Pagination cursor for retrieving the next page of results. Use this exact value in the `cursor` query parameter of your next request. If null or empty, there are no more results. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextCursor")
  public @Nullable String getNextCursor() {
    return nextCursor;
  }

  public void setNextCursor(@Nullable String nextCursor) {
    this.nextCursor = nextCursor;
  }

  public ServerListMetadata count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of items in current page
   * @return count
   */
  
  @Schema(name = "count", example = "30", description = "Number of items in current page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerListMetadata serverListMetadata = (ServerListMetadata) o;
    return Objects.equals(this.nextCursor, serverListMetadata.nextCursor) &&
        Objects.equals(this.count, serverListMetadata.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextCursor, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerListMetadata {\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

