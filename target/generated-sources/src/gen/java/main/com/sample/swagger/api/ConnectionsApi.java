/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.sample.swagger.api;

import com.sample.swagger.Connection;
import com.sample.swagger.ConnectionEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "connections", description = "the connections API")
public interface ConnectionsApi {

    Logger log = LoggerFactory.getLogger(ConnectionsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new connection to the list of connections", nickname = "addConnection", notes = "", response = ConnectionEntity.class, tags={ "connection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ConnectionEntity.class) })
    @RequestMapping(value = "/connections",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<ConnectionEntity> addConnection(@ApiParam(value = "Connection object that needs to be added to the list of connections" ,required=true )  @Valid @RequestBody Connection body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"id\" : 0,  \"category\" : {    \"hostName\" : \"hostName\",    \"password\" : \"password\",    \"databaseName\" : \"databaseName\",    \"port\" : 6,    \"name\" : \"name\",    \"username\" : \"username\"  }}", ConnectionEntity.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ConnectionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Deletes a connection by ID", nickname = "deleteConnectionById", notes = "", tags={ "connection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All corresponding entities were deleted."),
        @ApiResponse(code = 400, message = "Could not delete entities: Something went wrong!") })
    @RequestMapping(value = "/connections/{connectionId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteConnectionById(@ApiParam(value = "Connection ID to delete",required=true) @PathVariable("connectionId") Long connectionId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ConnectionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "List connections", nickname = "getConnection", notes = "Returns list of connections", response = ConnectionEntity.class, responseContainer = "List", tags={ "connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ConnectionEntity.class, responseContainer = "List") })
    @RequestMapping(value = "/connections",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ConnectionEntity>> getConnection() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"id\" : 0,  \"category\" : {    \"hostName\" : \"hostName\",    \"password\" : \"password\",    \"databaseName\" : \"databaseName\",    \"port\" : 6,    \"name\" : \"name\",    \"username\" : \"username\"  }}, {  \"id\" : 0,  \"category\" : {    \"hostName\" : \"hostName\",    \"password\" : \"password\",    \"databaseName\" : \"databaseName\",    \"port\" : 6,    \"name\" : \"name\",    \"username\" : \"username\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ConnectionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Find connection by ID", nickname = "getConnectionById", notes = "Returns a single connection", response = ConnectionEntity.class, tags={ "connection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ConnectionEntity.class) })
    @RequestMapping(value = "/connections/{connectionId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ConnectionEntity> getConnectionById(@ApiParam(value = "ID of connection to return",required=true) @PathVariable("connectionId") Long connectionId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"id\" : 0,  \"category\" : {    \"hostName\" : \"hostName\",    \"password\" : \"password\",    \"databaseName\" : \"databaseName\",    \"port\" : 6,    \"name\" : \"name\",    \"username\" : \"username\"  }}", ConnectionEntity.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ConnectionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update an existing connection by ID", nickname = "updateConnectionById", notes = "", tags={ "connection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Could not update the entity: The specified entity does not exist!") })
    @RequestMapping(value = "/connections/{connectionId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateConnectionById(@ApiParam(value = "ID of connection to update",required=true) @PathVariable("connectionId") Long connectionId,@ApiParam(value = "Connection object that needs to be updated in the list of connections" ,required=true )  @Valid @RequestBody Connection body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ConnectionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
