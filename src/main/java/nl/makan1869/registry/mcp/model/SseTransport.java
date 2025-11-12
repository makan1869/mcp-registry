package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SseTransport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class SseTransport implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Transport type
   */
  public enum TypeEnum {
    SSE("sse");

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

  private URI url;

  @Valid
  private List<KeyValueInput> headers = new ArrayList<>();

  public SseTransport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SseTransport(TypeEnum type, URI url) {
    this.type = type;
    this.url = url;
  }

  public SseTransport type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Transport type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "sse", description = "Transport type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SseTransport url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Server-Sent Events endpoint URL
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", example = "https://mcp-fs.example.com/sse", description = "Server-Sent Events endpoint URL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public SseTransport headers(List<KeyValueInput> headers) {
    this.headers = headers;
    return this;
  }

  public SseTransport addHeadersItem(KeyValueInput headersItem) {
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
    SseTransport sseTransport = (SseTransport) o;
    return Objects.equals(this.type, sseTransport.type) &&
        Objects.equals(this.url, sseTransport.url) &&
        Objects.equals(this.headers, sseTransport.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SseTransport {\n");
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

