package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * An optionally-sized icon that can be displayed in a user interface.
 */

@Schema(name = "Icon", description = "An optionally-sized icon that can be displayed in a user interface.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class Icon implements Serializable {

  private static final long serialVersionUID = 1L;

  private URI src;

  /**
   * Optional MIME type override if the source MIME type is missing or generic. Must be one of: image/png, image/jpeg, image/jpg, image/svg+xml, image/webp.
   */
  public enum MimeTypeEnum {
    IMAGE_PNG("image/png"),
    
    IMAGE_JPEG("image/jpeg"),
    
    IMAGE_JPG("image/jpg"),
    
    IMAGE_SVG_XML("image/svg+xml"),
    
    IMAGE_WEBP("image/webp");

    private final String value;

    MimeTypeEnum(String value) {
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
    public static MimeTypeEnum fromValue(String value) {
      for (MimeTypeEnum b : MimeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MimeTypeEnum mimeType;

  @Valid
  private List<@Pattern(regexp = "^(\\d+x\\d+|any)$")String> sizes = new ArrayList<>();

  /**
   * Optional specifier for the theme this icon is designed for. 'light' indicates the icon is designed to be used with a light background, and 'dark' indicates the icon is designed to be used with a dark background. If not provided, the client should assume the icon can be used with any theme.
   */
  public enum ThemeEnum {
    LIGHT("light"),
    
    DARK("dark");

    private final String value;

    ThemeEnum(String value) {
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
    public static ThemeEnum fromValue(String value) {
      for (ThemeEnum b : ThemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ThemeEnum theme;

  public Icon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Icon(URI src) {
    this.src = src;
  }

  public Icon src(URI src) {
    this.src = src;
    return this;
  }

  /**
   * A standard URI pointing to an icon resource. Must be an HTTPS URL. Consumers SHOULD take steps to ensure URLs serving icons are from the same domain as the server or a trusted domain. Consumers SHOULD take appropriate precautions when consuming SVGs as they can contain executable JavaScript.
   * @return src
   */
  @NotNull @Valid @Size(max = 255) 
  @Schema(name = "src", example = "https://example.com/icon.png", description = "A standard URI pointing to an icon resource. Must be an HTTPS URL. Consumers SHOULD take steps to ensure URLs serving icons are from the same domain as the server or a trusted domain. Consumers SHOULD take appropriate precautions when consuming SVGs as they can contain executable JavaScript.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("src")
  public URI getSrc() {
    return src;
  }

  public void setSrc(URI src) {
    this.src = src;
  }

  public Icon mimeType(@Nullable MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Optional MIME type override if the source MIME type is missing or generic. Must be one of: image/png, image/jpeg, image/jpg, image/svg+xml, image/webp.
   * @return mimeType
   */
  
  @Schema(name = "mimeType", example = "image/png", description = "Optional MIME type override if the source MIME type is missing or generic. Must be one of: image/png, image/jpeg, image/jpg, image/svg+xml, image/webp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeType")
  public @Nullable MimeTypeEnum getMimeType() {
    return mimeType;
  }

  public void setMimeType(@Nullable MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
  }

  public Icon sizes(List<@Pattern(regexp = "^(\\d+x\\d+|any)$")String> sizes) {
    this.sizes = sizes;
    return this;
  }

  public Icon addSizesItem(String sizesItem) {
    if (this.sizes == null) {
      this.sizes = new ArrayList<>();
    }
    this.sizes.add(sizesItem);
    return this;
  }

  /**
   * Optional array of strings that specify sizes at which the icon can be used. Each string should be in WxH format (e.g., '48x48', '96x96') or 'any' for scalable formats like SVG. If not provided, the client should assume that the icon can be used at any size.
   * @return sizes
   */
  
  @Schema(name = "sizes", description = "Optional array of strings that specify sizes at which the icon can be used. Each string should be in WxH format (e.g., '48x48', '96x96') or 'any' for scalable formats like SVG. If not provided, the client should assume that the icon can be used at any size.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sizes")
  public List<@Pattern(regexp = "^(\\d+x\\d+|any)$")String> getSizes() {
    return sizes;
  }

  public void setSizes(List<@Pattern(regexp = "^(\\d+x\\d+|any)$")String> sizes) {
    this.sizes = sizes;
  }

  public Icon theme(@Nullable ThemeEnum theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Optional specifier for the theme this icon is designed for. 'light' indicates the icon is designed to be used with a light background, and 'dark' indicates the icon is designed to be used with a dark background. If not provided, the client should assume the icon can be used with any theme.
   * @return theme
   */
  
  @Schema(name = "theme", description = "Optional specifier for the theme this icon is designed for. 'light' indicates the icon is designed to be used with a light background, and 'dark' indicates the icon is designed to be used with a dark background. If not provided, the client should assume the icon can be used with any theme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("theme")
  public @Nullable ThemeEnum getTheme() {
    return theme;
  }

  public void setTheme(@Nullable ThemeEnum theme) {
    this.theme = theme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Icon icon = (Icon) o;
    return Objects.equals(this.src, icon.src) &&
        Objects.equals(this.mimeType, icon.mimeType) &&
        Objects.equals(this.sizes, icon.sizes) &&
        Objects.equals(this.theme, icon.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, mimeType, sizes, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Icon {\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    sizes: ").append(toIndentedString(sizes)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

