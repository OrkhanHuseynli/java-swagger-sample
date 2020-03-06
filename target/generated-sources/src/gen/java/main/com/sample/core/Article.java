package com.sample.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Article
 */
@Validated

public class Article   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("content")
  private String content = null;

  public Article title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Article title
   * @return title
  **/
  @ApiModelProperty(value = "Article title")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Article content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Article content
   * @return content
  **/
  @ApiModelProperty(value = "Article content")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.title, article.title) &&
        Objects.equals(this.content, article.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

