package com.techprimers.graphql.springbootgrapqlexample.resource;

import com.techprimers.graphql.springbootgrapqlexample.dto.GraphqlRequestBody;
import com.techprimers.graphql.springbootgrapqlexample.service.GraphQLService;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class BookResource {

    @Autowired
    GraphQLService graphQLService;

    @PostMapping("/rest/books")
    public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
//        graphQLService.getGraphQL().execute(ExecutionInput.newExecutionInput()
//                .query("").operationName("").variables("").build());
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }

    @PostMapping(value = "/books", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findAllBooks(@RequestBody GraphqlRequestBody body) {
//        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        ExecutionResult execute = graphQLService.getGraphQL().execute(ExecutionInput.newExecutionInput()
                .query(body.getQuery()).operationName(body.getOperationName())
                .variables(body.getVariables()).build());
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
