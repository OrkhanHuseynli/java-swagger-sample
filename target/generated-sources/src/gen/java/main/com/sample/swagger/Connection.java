package com.sample.swagger;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Connection
 */
@Validated

public class Connection   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("databaseName")
  private String databaseName = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  public Connection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Custom name of the database instance
   * @return name
  **/
  @ApiModelProperty(value = "Custom name of the database instance")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Connection hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Hostname of the database
   * @return hostName
  **/
  @ApiModelProperty(value = "Hostname of the database")


  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Connection port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port where the database runs
   * @return port
  **/
  @ApiModelProperty(value = "Port where the database runs")


  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Connection databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Name of the database
   * @return databaseName
  **/
  @ApiModelProperty(value = "Name of the database")


  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public Connection username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username to connect to the database
   * @return username
  **/
  @ApiModelProperty(value = "Username to connect to the database")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Connection password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password to connect to the database
   * @return password
  **/
  @ApiModelProperty(value = "Password to connect to the database")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.name, connection.name) &&
        Objects.equals(this.hostName, connection.hostName) &&
        Objects.equals(this.port, connection.port) &&
        Objects.equals(this.databaseName, connection.databaseName) &&
        Objects.equals(this.username, connection.username) &&
        Objects.equals(this.password, connection.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostName, port, databaseName, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

