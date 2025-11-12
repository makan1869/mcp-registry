package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.net.URI;
import java.util.Objects;

/**
 * Repository metadata for the MCP server source code. Enables users and security experts to inspect the code, improving transparency.
 */

@Schema(name = "Repository", description = "Repository metadata for the MCP server source code. Enables users and security experts to inspect the code, improving transparency.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class Repository implements Serializable {

  private static final long serialVersionUID = 1L;

  private URI url;

  private String source;

  private @Nullable String id;

  private @Nullable String subfolder;

  public Repository() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Repository(URI url, String source) {
    this.url = url;
    this.source = source;
  }

  public Repository url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Repository URL for browsing source code. Should support both web browsing and git clone operations.
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", example = "https://github.com/modelcontextprotocol/servers", description = "Repository URL for browsing source code. Should support both web browsing and git clone operations.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public Repository source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Repository hosting service identifier. Used by registries to determine validation and API access methods.
   * @return source
   */
  @NotNull 
  @Schema(name = "source", example = "github", description = "Repository hosting service identifier. Used by registries to determine validation and API access methods.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Repository id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Repository identifier from the hosting service (e.g., GitHub repo ID). Owned and determined by the source forge. Should remain stable across repository renames and may be used to detect repository resurrection attacks - if a repository is deleted and recreated, the ID should change. For GitHub, use: gh api repos/<owner>/<repo> --jq '.id'
   * @return id
   */
  
  @Schema(name = "id", example = "b94b5f7e-c7c6-d760-2c78-a5e9b8a5b8c9", description = "Repository identifier from the hosting service (e.g., GitHub repo ID). Owned and determined by the source forge. Should remain stable across repository renames and may be used to detect repository resurrection attacks - if a repository is deleted and recreated, the ID should change. For GitHub, use: gh api repos/<owner>/<repo> --jq '.id'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Repository subfolder(@Nullable String subfolder) {
    this.subfolder = subfolder;
    return this;
  }

  /**
   * Optional relative path from repository root to the server location within a monorepo or nested package structure. Must be a clean relative path.
   * @return subfolder
   */
  
  @Schema(name = "subfolder", example = "src/everything", description = "Optional relative path from repository root to the server location within a monorepo or nested package structure. Must be a clean relative path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subfolder")
  public @Nullable String getSubfolder() {
    return subfolder;
  }

  public void setSubfolder(@Nullable String subfolder) {
    this.subfolder = subfolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.url, repository.url) &&
        Objects.equals(this.source, repository.source) &&
        Objects.equals(this.id, repository.id) &&
        Objects.equals(this.subfolder, repository.subfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, source, id, subfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subfolder: ").append(toIndentedString(subfolder)).append("\n");
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

