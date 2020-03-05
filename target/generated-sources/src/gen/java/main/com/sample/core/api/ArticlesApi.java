/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.sample.core.api;

import com.sample.core.Article;
import com.sample.core.GeneralResponse;
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

@Api(value = "articles", description = "the articles API")
public interface ArticlesApi {

    Logger log = LoggerFactory.getLogger(ArticlesApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "List articles", nickname = "articles", notes = "Returns list of articles", response = Article.class, responseContainer = "List", tags={ "articles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Article.class, responseContainer = "List") })
    @RequestMapping(value = "/articles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Article>> articles() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"title\" : \"title\",  \"content\" : \"content\"}, {  \"title\" : \"title\",  \"content\" : \"content\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ArticlesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Deletes a article by ID", nickname = "deleteArticle", notes = "", tags={ "article", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All corresponding entities were deleted."),
        @ApiResponse(code = 400, message = "Could not delete entities: Something went wrong!") })
    @RequestMapping(value = "/articles/{articleID}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteArticle(@ApiParam(value = "Article ID to delete",required=true) @PathVariable("articleID") Long articleID) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ArticlesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Find connection by ID", nickname = "getArticle", notes = "Returns a single connection", response = Article.class, tags={ "connection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Article.class) })
    @RequestMapping(value = "/articles/{articleID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Article> getArticle(@ApiParam(value = "ID of the article to return",required=true) @PathVariable("articleID") Integer articleID) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"title\" : \"title\",  \"content\" : \"content\"}", Article.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ArticlesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Add a new article to the list of connections", nickname = "postArticle", notes = "", response = GeneralResponse.class, tags={ "article", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GeneralResponse.class) })
    @RequestMapping(value = "/articles",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<GeneralResponse> postArticle(@ApiParam(value = "Article object that needs to be added to the list of articles" ,required=true )  @Valid @RequestBody Article body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"message\"}", GeneralResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ArticlesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update an existing article by ID", nickname = "updateArticle", notes = "", tags={ "article", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Could not update the entity: The specified entity does not exist!") })
    @RequestMapping(value = "/articles/{articleID}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateArticle(@ApiParam(value = "ID of article to update",required=true) @PathVariable("connectionId") Long connectionId,@ApiParam(value = "Article object that needs to be updated in the list of articles" ,required=true )  @Valid @RequestBody Article body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ArticlesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
