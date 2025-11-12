package nl.makan1869.registry.mcp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.*;

/**
 * A positional input is a value inserted verbatim into the command line.
 */

@Schema(name = "PositionalArgument", description = "A positional input is a value inserted verbatim into the command line.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-12T14:19:03.303636+01:00[Europe/Amsterdam]", comments = "Generator version: 7.17.0")
public class PositionalArgument implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String description;

  private Boolean isRequired = false;

  /**
   * Specifies the input format. Supported values include `filepath`, which should be interpreted as a file on the user's filesystem.  When the input is converted to a string, booleans should be represented by the strings \"true\" and \"false\", and numbers should be represented as decimal values.
   */
  public enum FormatEnum {
    STRING("string"),
    
    NUMBER("number"),
    
    BOOLEAN("boolean"),
    
    FILEPATH("filepath");

    private final String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FormatEnum format = FormatEnum.STRING;

  private @Nullable String value;

  private Boolean isSecret = false;

  private @Nullable String _default;

  private @Nullable String placeholder;

  @Valid
  private List<String> choices = new ArrayList<>();

  @Valid
  private Map<String, Input> variables = new HashMap<>();

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    POSITIONAL("positional");

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

  private @Nullable String valueHint;

  private Boolean isRepeated = false;

  public PositionalArgument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PositionalArgument(TypeEnum type) {
    this.type = type;
  }

  public PositionalArgument description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the input, which clients can use to provide context to the user.
   * @return description
   */
  
  @Schema(name = "description", description = "A description of the input, which clients can use to provide context to the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public PositionalArgument isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
   */
  
  @Schema(name = "isRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public PositionalArgument format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Specifies the input format. Supported values include `filepath`, which should be interpreted as a file on the user's filesystem.  When the input is converted to a string, booleans should be represented by the strings \"true\" and \"false\", and numbers should be represented as decimal values.
   * @return format
   */
  
  @Schema(name = "format", description = "Specifies the input format. Supported values include `filepath`, which should be interpreted as a file on the user's filesystem.  When the input is converted to a string, booleans should be represented by the strings \"true\" and \"false\", and numbers should be represented as decimal values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public PositionalArgument value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * The value for the input. If this is not set, the user may be prompted to provide a value. If a value is set, it should not be configurable by end users.  Identifiers wrapped in `{curly_braces}` will be replaced with the corresponding properties from the input `variables` map. If an identifier in braces is not found in `variables`, or if `variables` is not provided, the `{curly_braces}` substring should remain unchanged. 
   * @return value
   */
  
  @Schema(name = "value", description = "The value for the input. If this is not set, the user may be prompted to provide a value. If a value is set, it should not be configurable by end users.  Identifiers wrapped in `{curly_braces}` will be replaced with the corresponding properties from the input `variables` map. If an identifier in braces is not found in `variables`, or if `variables` is not provided, the `{curly_braces}` substring should remain unchanged. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }

  public PositionalArgument isSecret(Boolean isSecret) {
    this.isSecret = isSecret;
    return this;
  }

  /**
   * Indicates whether the input is a secret value (e.g., password, token). If true, clients should handle the value securely.
   * @return isSecret
   */
  
  @Schema(name = "isSecret", description = "Indicates whether the input is a secret value (e.g., password, token). If true, clients should handle the value securely.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSecret")
  public Boolean getIsSecret() {
    return isSecret;
  }

  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }

  public PositionalArgument _default(@Nullable String _default) {
    this._default = _default;
    return this;
  }

  /**
   * The default value for the input.  This should be a valid value for the input.  If you want to provide input examples or guidance, use the `placeholder` field instead.
   * @return _default
   */
  
  @Schema(name = "default", description = "The default value for the input.  This should be a valid value for the input.  If you want to provide input examples or guidance, use the `placeholder` field instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public @Nullable String getDefault() {
    return _default;
  }

  public void setDefault(@Nullable String _default) {
    this._default = _default;
  }

  public PositionalArgument placeholder(@Nullable String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * A placeholder for the input to be displaying during configuration. This is used to provide examples or guidance about the expected form or content of the input.
   * @return placeholder
   */
  
  @Schema(name = "placeholder", description = "A placeholder for the input to be displaying during configuration. This is used to provide examples or guidance about the expected form or content of the input.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeholder")
  public @Nullable String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(@Nullable String placeholder) {
    this.placeholder = placeholder;
  }

  public PositionalArgument choices(List<String> choices) {
    this.choices = choices;
    return this;
  }

  public PositionalArgument addChoicesItem(String choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * A list of possible values for the input. If provided, the user must select one of these values.
   * @return choices
   */
  
  @Schema(name = "choices", example = "[]", description = "A list of possible values for the input. If provided, the user must select one of these values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("choices")
  public List<String> getChoices() {
    return choices;
  }

  public void setChoices(List<String> choices) {
    this.choices = choices;
  }

  public PositionalArgument variables(Map<String, Input> variables) {
    this.variables = variables;
    return this;
  }

  public PositionalArgument putVariablesItem(String key, Input variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A map of variable names to their values. Keys in the input `value` that are wrapped in `{curly_braces}` will be replaced with the corresponding variable values.
   * @return variables
   */
  @Valid 
  @Schema(name = "variables", description = "A map of variable names to their values. Keys in the input `value` that are wrapped in `{curly_braces}` will be replaced with the corresponding variable values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, Input> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, Input> variables) {
    this.variables = variables;
  }

  public PositionalArgument type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "positional", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PositionalArgument valueHint(@Nullable String valueHint) {
    this.valueHint = valueHint;
    return this;
  }

  /**
   * An identifier for the positional argument. It is not part of the command line. It may be used by client configuration as a label identifying the argument. It is also used to identify the value in transport URL variable substitution.
   * @return valueHint
   */
  
  @Schema(name = "valueHint", example = "file_path", description = "An identifier for the positional argument. It is not part of the command line. It may be used by client configuration as a label identifying the argument. It is also used to identify the value in transport URL variable substitution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueHint")
  public @Nullable String getValueHint() {
    return valueHint;
  }

  public void setValueHint(@Nullable String valueHint) {
    this.valueHint = valueHint;
  }

  public PositionalArgument isRepeated(Boolean isRepeated) {
    this.isRepeated = isRepeated;
    return this;
  }

  /**
   * Whether the argument can be repeated multiple times in the command line.
   * @return isRepeated
   */
  
  @Schema(name = "isRepeated", description = "Whether the argument can be repeated multiple times in the command line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRepeated")
  public Boolean getIsRepeated() {
    return isRepeated;
  }

  public void setIsRepeated(Boolean isRepeated) {
    this.isRepeated = isRepeated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionalArgument positionalArgument = (PositionalArgument) o;
    return Objects.equals(this.description, positionalArgument.description) &&
        Objects.equals(this.isRequired, positionalArgument.isRequired) &&
        Objects.equals(this.format, positionalArgument.format) &&
        Objects.equals(this.value, positionalArgument.value) &&
        Objects.equals(this.isSecret, positionalArgument.isSecret) &&
        Objects.equals(this._default, positionalArgument._default) &&
        Objects.equals(this.placeholder, positionalArgument.placeholder) &&
        Objects.equals(this.choices, positionalArgument.choices) &&
        Objects.equals(this.variables, positionalArgument.variables) &&
        Objects.equals(this.type, positionalArgument.type) &&
        Objects.equals(this.valueHint, positionalArgument.valueHint) &&
        Objects.equals(this.isRepeated, positionalArgument.isRepeated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isRequired, format, value, isSecret, _default, placeholder, choices, variables, type, valueHint, isRepeated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionalArgument {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueHint: ").append(toIndentedString(valueHint)).append("\n");
    sb.append("    isRepeated: ").append(toIndentedString(isRepeated)).append("\n");
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

