package com.sample.swagger;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sample.swagger.Connection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnectionEntity
 */
@Validated

public class ConnectionEntity   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("category")
  private Connection category = null;

  public ConnectionEntity id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Connection entity ID
   * @return id
  **/
  @ApiModelProperty(value = "Connection entity ID")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ConnectionEntity category(Connection category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Connection getCategory() {
    return category;
  }

  public void setCategory(Connection category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionEntity connectionEntity = (ConnectionEntity) o;
    return Objects.equals(this.id, connectionEntity.id) &&
        Objects.equals(this.category, connectionEntity.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

