package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.makan1869.registry.mcp.model.KeyValueInput;
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
 * StreamableHttpTransport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class StreamableHttpTransport implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Transport type
   */
  public enum TypeEnum {
    STREAMABLE_HTTP("streamable-http");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String url;

  @Valid
  private List<KeyValueInput> headers = new ArrayList<>();

  public StreamableHttpTransport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StreamableHttpTransport(TypeEnum type, String url) {
    this.type = type;
    this.url = url;
  }

  public StreamableHttpTransport type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Transport type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "streamable-http", description = "Transport type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StreamableHttpTransport url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL template for the streamable-http transport. Variables in {curly_braces} reference argument valueHints, argument names, or environment variable names. After variable substitution, this should produce a valid URI.
   * @return url
   */
  @NotNull 
  @Schema(name = "url", example = "https://api.example.com/mcp", description = "URL template for the streamable-http transport. Variables in {curly_braces} reference argument valueHints, argument names, or environment variable names. After variable substitution, this should produce a valid URI.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public StreamableHttpTransport headers(List<KeyValueInput> headers) {
    this.headers = headers;
    return this;
  }

  public StreamableHttpTransport addHeadersItem(KeyValueInput headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * HTTP headers to include
   * @return headers
   */
  @Valid 
  @Schema(name = "headers", description = "HTTP headers to include", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public List<KeyValueInput> getHeaders() {
    return headers;
  }

  public void setHeaders(List<KeyValueInput> headers) {
    this.headers = headers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamableHttpTransport streamableHttpTransport = (StreamableHttpTransport) o;
    return Objects.equals(this.type, streamableHttpTransport.type) &&
        Objects.equals(this.url, streamableHttpTransport.url) &&
        Objects.equals(this.headers, streamableHttpTransport.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamableHttpTransport {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

