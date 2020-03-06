package com.sample.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sample.core.Article;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ArticleEntity
 */
@Validated

public class ArticleEntity   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("category")
  private Article category = null;

  public ArticleEntity id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Article ID
   * @return id
  **/
  @ApiModelProperty(value = "Article ID")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ArticleEntity category(Article category) {
    this.category = category;
    return this;
  }

  /**
   * Article content
   * @return category
  **/
  @ApiModelProperty(value = "Article content")

  @Valid

  public Article getCategory() {
    return category;
  }

  public void setCategory(Article category) {
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
    ArticleEntity articleEntity = (ArticleEntity) o;
    return Objects.equals(this.id, articleEntity.id) &&
        Objects.equals(this.category, articleEntity.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleEntity {\n");
    
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

