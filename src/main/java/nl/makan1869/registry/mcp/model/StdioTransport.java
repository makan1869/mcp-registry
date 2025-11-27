package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * StdioTransport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class StdioTransport implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Transport type
   */
  public enum TypeEnum {
    STDIO("stdio");

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

  public StdioTransport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StdioTransport(TypeEnum type) {
    this.type = type;
  }

  public StdioTransport type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Transport type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "stdio", description = "Transport type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StdioTransport stdioTransport = (StdioTransport) o;
    return Objects.equals(this.type, stdioTransport.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StdioTransport {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

