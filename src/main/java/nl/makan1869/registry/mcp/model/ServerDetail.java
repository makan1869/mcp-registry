package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Schema for a static representation of an MCP server. Used in various contexts related to discovery, installation, and configuration.
 */

@Schema(name = "ServerDetail", description = "Schema for a static representation of an MCP server. Used in various contexts related to discovery, installation, and configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ServerDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private @Nullable String title;

  private @Nullable Repository repository;

  private String version;

  private @Nullable URI websiteUrl;

  @Valid
  private List<@Valid Icon> icons = new ArrayList<>();

  private @Nullable URI $schema;

  @Valid
  private List<@Valid ModelPackage> packages = new ArrayList<>();

  @Valid
  private List<ServerDetailRemotesInner> remotes = new ArrayList<>();

  private @Nullable ServerDetailMeta meta;

  public ServerDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerDetail(String name, String description, String version) {
    this.name = name;
    this.description = description;
    this.version = version;
  }

  public ServerDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Server name in reverse-DNS format. Must contain exactly one forward slash separating namespace from server name.
   * @return name
   */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9.-]+/[a-zA-Z0-9._-]+$") @Size(min = 3, max = 200) 
  @Schema(name = "name", example = "io.github.user/weather", description = "Server name in reverse-DNS format. Must contain exactly one forward slash separating namespace from server name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServerDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Clear human-readable explanation of server functionality. Should focus on capabilities, not implementation details.
   * @return description
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "description", example = "MCP server providing weather data and forecasts via OpenWeatherMap API", description = "Clear human-readable explanation of server functionality. Should focus on capabilities, not implementation details.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerDetail title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Optional human-readable title or display name for the MCP server. MCP subregistries or clients MAY choose to use this for display purposes.
   * @return title
   */
  @Size(min = 1, max = 100) 
  @Schema(name = "title", example = "Weather API", description = "Optional human-readable title or display name for the MCP server. MCP subregistries or clients MAY choose to use this for display purposes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ServerDetail repository(@Nullable Repository repository) {
    this.repository = repository;
    return this;
  }

  /**
   * Optional repository metadata for the MCP server source code. Recommended for transparency and security inspection.
   * @return repository
   */
  @Valid 
  @Schema(name = "repository", description = "Optional repository metadata for the MCP server source code. Recommended for transparency and security inspection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repository")
  public @Nullable Repository getRepository() {
    return repository;
  }

  public void setRepository(@Nullable Repository repository) {
    this.repository = repository;
  }

  public ServerDetail version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version string for this server. SHOULD follow semantic versioning (e.g., '1.0.2', '2.1.0-alpha'). Equivalent of Implementation.version in MCP specification. Non-semantic versions are allowed but may not sort predictably. Version ranges are rejected (e.g., '^1.2.3', '~1.2.3', '>=1.2.3', '1.x', '1.*').
   * @return version
   */
  @NotNull @Size(max = 255) 
  @Schema(name = "version", example = "1.0.2", description = "Version string for this server. SHOULD follow semantic versioning (e.g., '1.0.2', '2.1.0-alpha'). Equivalent of Implementation.version in MCP specification. Non-semantic versions are allowed but may not sort predictably. Version ranges are rejected (e.g., '^1.2.3', '~1.2.3', '>=1.2.3', '1.x', '1.*').", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServerDetail websiteUrl(@Nullable URI websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Optional URL to the server's homepage, documentation, or project website. This provides a central link for users to learn more about the server. Particularly useful when the server has custom installation instructions or setup requirements.
   * @return websiteUrl
   */
  @Valid 
  @Schema(name = "websiteUrl", example = "https://modelcontextprotocol.io/examples", description = "Optional URL to the server's homepage, documentation, or project website. This provides a central link for users to learn more about the server. Particularly useful when the server has custom installation instructions or setup requirements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("websiteUrl")
  public @Nullable URI getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(@Nullable URI websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public ServerDetail icons(List<@Valid Icon> icons) {
    this.icons = icons;
    return this;
  }

  public ServerDetail addIconsItem(Icon iconsItem) {
    if (this.icons == null) {
      this.icons = new ArrayList<>();
    }
    this.icons.add(iconsItem);
    return this;
  }

  /**
   * Optional set of sized icons that the client can display in a user interface. Clients that support rendering icons MUST support at least the following MIME types: image/png and image/jpeg (safe, universal compatibility). Clients SHOULD also support: image/svg+xml (scalable but requires security precautions) and image/webp (modern, efficient format).
   * @return icons
   */
  @Valid 
  @Schema(name = "icons", description = "Optional set of sized icons that the client can display in a user interface. Clients that support rendering icons MUST support at least the following MIME types: image/png and image/jpeg (safe, universal compatibility). Clients SHOULD also support: image/svg+xml (scalable but requires security precautions) and image/webp (modern, efficient format).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icons")
  public List<@Valid Icon> getIcons() {
    return icons;
  }

  public void setIcons(List<@Valid Icon> icons) {
    this.icons = icons;
  }

  public ServerDetail $schema(@Nullable URI $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * JSON Schema URI for this server.json format
   * @return $schema
   */
  @Valid 
  @Schema(name = "$schema", example = "https://static.modelcontextprotocol.io/schemas/2025-10-17/server.schema.json", description = "JSON Schema URI for this server.json format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("$schema")
  public @Nullable URI get$Schema() {
    return $schema;
  }

  public void set$Schema(@Nullable URI $schema) {
    this.$schema = $schema;
  }

  public ServerDetail packages(List<@Valid ModelPackage> packages) {
    this.packages = packages;
    return this;
  }

  public ServerDetail addPackagesItem(ModelPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
   */
  @Valid 
  @Schema(name = "packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packages")
  public List<@Valid ModelPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<@Valid ModelPackage> packages) {
    this.packages = packages;
  }

  public ServerDetail remotes(List<ServerDetailRemotesInner> remotes) {
    this.remotes = remotes;
    return this;
  }

  public ServerDetail addRemotesItem(ServerDetailRemotesInner remotesItem) {
    if (this.remotes == null) {
      this.remotes = new ArrayList<>();
    }
    this.remotes.add(remotesItem);
    return this;
  }

  /**
   * Get remotes
   * @return remotes
   */
  @Valid 
  @Schema(name = "remotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remotes")
  public List<ServerDetailRemotesInner> getRemotes() {
    return remotes;
  }

  public void setRemotes(List<ServerDetailRemotesInner> remotes) {
    this.remotes = remotes;
  }

  public ServerDetail meta(@Nullable ServerDetailMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @Valid 
  @Schema(name = "_meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_meta")
  public @Nullable ServerDetailMeta getMeta() {
    return meta;
  }

  public void setMeta(@Nullable ServerDetailMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerDetail serverDetail = (ServerDetail) o;
    return Objects.equals(this.name, serverDetail.name) &&
        Objects.equals(this.description, serverDetail.description) &&
        Objects.equals(this.title, serverDetail.title) &&
        Objects.equals(this.repository, serverDetail.repository) &&
        Objects.equals(this.version, serverDetail.version) &&
        Objects.equals(this.websiteUrl, serverDetail.websiteUrl) &&
        Objects.equals(this.icons, serverDetail.icons) &&
        Objects.equals(this.$schema, serverDetail.$schema) &&
        Objects.equals(this.packages, serverDetail.packages) &&
        Objects.equals(this.remotes, serverDetail.remotes) &&
        Objects.equals(this.meta, serverDetail.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, title, repository, version, websiteUrl, icons, $schema, packages, remotes, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    remotes: ").append(toIndentedString(remotes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

