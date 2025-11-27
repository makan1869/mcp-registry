package nl.makan1869.registry.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.makan1869.registry.mcp.model.Argument;
import nl.makan1869.registry.mcp.model.KeyValueInput;
import nl.makan1869.registry.mcp.model.PackageTransport;
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
 * ModelPackage
 */

@JsonTypeName("Package")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-26T22:12:44.318620+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class ModelPackage implements Serializable {

  private static final long serialVersionUID = 1L;

  private String registryType;

  private @Nullable URI registryBaseUrl;

  private String identifier;

  private @Nullable String version;

  private @Nullable String fileSha256;

  private @Nullable String runtimeHint;

  private PackageTransport transport;

  @Valid
  private List<Argument> runtimeArguments = new ArrayList<>();

  @Valid
  private List<Argument> packageArguments = new ArrayList<>();

  @Valid
  private List<KeyValueInput> environmentVariables = new ArrayList<>();

  public ModelPackage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ModelPackage(String registryType, String identifier, PackageTransport transport) {
    this.registryType = registryType;
    this.identifier = identifier;
    this.transport = transport;
  }

  public ModelPackage registryType(String registryType) {
    this.registryType = registryType;
    return this;
  }

  /**
   * Registry type indicating how to download packages (e.g., 'npm', 'pypi', 'oci', 'nuget', 'mcpb')
   * @return registryType
   */
  @NotNull 
  @Schema(name = "registryType", description = "Registry type indicating how to download packages (e.g., 'npm', 'pypi', 'oci', 'nuget', 'mcpb')", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registryType")
  public String getRegistryType() {
    return registryType;
  }

  public void setRegistryType(String registryType) {
    this.registryType = registryType;
  }

  public ModelPackage registryBaseUrl(@Nullable URI registryBaseUrl) {
    this.registryBaseUrl = registryBaseUrl;
    return this;
  }

  /**
   * Base URL of the package registry
   * @return registryBaseUrl
   */
  @Valid 
  @Schema(name = "registryBaseUrl", description = "Base URL of the package registry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registryBaseUrl")
  public @Nullable URI getRegistryBaseUrl() {
    return registryBaseUrl;
  }

  public void setRegistryBaseUrl(@Nullable URI registryBaseUrl) {
    this.registryBaseUrl = registryBaseUrl;
  }

  public ModelPackage identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Package identifier - either a package name (for registries) or URL (for direct downloads)
   * @return identifier
   */
  @NotNull 
  @Schema(name = "identifier", description = "Package identifier - either a package name (for registries) or URL (for direct downloads)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ModelPackage version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Package version. Must be a specific version. Version ranges are rejected (e.g., '^1.2.3', '~1.2.3', '>=1.2.3', '1.x', '1.*').
   * @return version
   */
  @Size(min = 1) 
  @Schema(name = "version", example = "1.0.2", description = "Package version. Must be a specific version. Version ranges are rejected (e.g., '^1.2.3', '~1.2.3', '>=1.2.3', '1.x', '1.*').", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public ModelPackage fileSha256(@Nullable String fileSha256) {
    this.fileSha256 = fileSha256;
    return this;
  }

  /**
   * SHA-256 hash of the package file for integrity verification. Required for MCPB packages and optional for other package types. Authors are responsible for generating correct SHA-256 hashes when creating server.json. If present, MCP clients must validate the downloaded file matches the hash before running packages to ensure file integrity.
   * @return fileSha256
   */
  @Pattern(regexp = "^[a-f0-9]{64}$") 
  @Schema(name = "fileSha256", example = "fe333e598595000ae021bd27117db32ec69af6987f507ba7a63c90638ff633ce", description = "SHA-256 hash of the package file for integrity verification. Required for MCPB packages and optional for other package types. Authors are responsible for generating correct SHA-256 hashes when creating server.json. If present, MCP clients must validate the downloaded file matches the hash before running packages to ensure file integrity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileSha256")
  public @Nullable String getFileSha256() {
    return fileSha256;
  }

  public void setFileSha256(@Nullable String fileSha256) {
    this.fileSha256 = fileSha256;
  }

  public ModelPackage runtimeHint(@Nullable String runtimeHint) {
    this.runtimeHint = runtimeHint;
    return this;
  }

  /**
   * A hint to help clients determine the appropriate runtime for the package. This field should be provided when `runtimeArguments` are present.
   * @return runtimeHint
   */
  
  @Schema(name = "runtimeHint", description = "A hint to help clients determine the appropriate runtime for the package. This field should be provided when `runtimeArguments` are present.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runtimeHint")
  public @Nullable String getRuntimeHint() {
    return runtimeHint;
  }

  public void setRuntimeHint(@Nullable String runtimeHint) {
    this.runtimeHint = runtimeHint;
  }

  public ModelPackage transport(PackageTransport transport) {
    this.transport = transport;
    return this;
  }

  /**
   * Get transport
   * @return transport
   */
  @NotNull @Valid 
  @Schema(name = "transport", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transport")
  public PackageTransport getTransport() {
    return transport;
  }

  public void setTransport(PackageTransport transport) {
    this.transport = transport;
  }

  public ModelPackage runtimeArguments(List<Argument> runtimeArguments) {
    this.runtimeArguments = runtimeArguments;
    return this;
  }

  public ModelPackage addRuntimeArgumentsItem(Argument runtimeArgumentsItem) {
    if (this.runtimeArguments == null) {
      this.runtimeArguments = new ArrayList<>();
    }
    this.runtimeArguments.add(runtimeArgumentsItem);
    return this;
  }

  /**
   * A list of arguments to be passed to the package's runtime command (such as docker or npx). The `runtimeHint` field should be provided when `runtimeArguments` are present.
   * @return runtimeArguments
   */
  @Valid 
  @Schema(name = "runtimeArguments", description = "A list of arguments to be passed to the package's runtime command (such as docker or npx). The `runtimeHint` field should be provided when `runtimeArguments` are present.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runtimeArguments")
  public List<Argument> getRuntimeArguments() {
    return runtimeArguments;
  }

  public void setRuntimeArguments(List<Argument> runtimeArguments) {
    this.runtimeArguments = runtimeArguments;
  }

  public ModelPackage packageArguments(List<Argument> packageArguments) {
    this.packageArguments = packageArguments;
    return this;
  }

  public ModelPackage addPackageArgumentsItem(Argument packageArgumentsItem) {
    if (this.packageArguments == null) {
      this.packageArguments = new ArrayList<>();
    }
    this.packageArguments.add(packageArgumentsItem);
    return this;
  }

  /**
   * A list of arguments to be passed to the package's binary.
   * @return packageArguments
   */
  @Valid 
  @Schema(name = "packageArguments", description = "A list of arguments to be passed to the package's binary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageArguments")
  public List<Argument> getPackageArguments() {
    return packageArguments;
  }

  public void setPackageArguments(List<Argument> packageArguments) {
    this.packageArguments = packageArguments;
  }

  public ModelPackage environmentVariables(List<KeyValueInput> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  public ModelPackage addEnvironmentVariablesItem(KeyValueInput environmentVariablesItem) {
    if (this.environmentVariables == null) {
      this.environmentVariables = new ArrayList<>();
    }
    this.environmentVariables.add(environmentVariablesItem);
    return this;
  }

  /**
   * A mapping of environment variables to be set when running the package.
   * @return environmentVariables
   */
  @Valid 
  @Schema(name = "environmentVariables", description = "A mapping of environment variables to be set when running the package.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environmentVariables")
  public List<KeyValueInput> getEnvironmentVariables() {
    return environmentVariables;
  }

  public void setEnvironmentVariables(List<KeyValueInput> environmentVariables) {
    this.environmentVariables = environmentVariables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.registryType, _package.registryType) &&
        Objects.equals(this.registryBaseUrl, _package.registryBaseUrl) &&
        Objects.equals(this.identifier, _package.identifier) &&
        Objects.equals(this.version, _package.version) &&
        Objects.equals(this.fileSha256, _package.fileSha256) &&
        Objects.equals(this.runtimeHint, _package.runtimeHint) &&
        Objects.equals(this.transport, _package.transport) &&
        Objects.equals(this.runtimeArguments, _package.runtimeArguments) &&
        Objects.equals(this.packageArguments, _package.packageArguments) &&
        Objects.equals(this.environmentVariables, _package.environmentVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryType, registryBaseUrl, identifier, version, fileSha256, runtimeHint, transport, runtimeArguments, packageArguments, environmentVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
    sb.append("    registryBaseUrl: ").append(toIndentedString(registryBaseUrl)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
    sb.append("    runtimeHint: ").append(toIndentedString(runtimeHint)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    runtimeArguments: ").append(toIndentedString(runtimeArguments)).append("\n");
    sb.append("    packageArguments: ").append(toIndentedString(packageArguments)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
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

