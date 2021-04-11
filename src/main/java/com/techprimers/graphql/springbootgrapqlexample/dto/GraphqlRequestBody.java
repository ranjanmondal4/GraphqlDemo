package com.techprimers.graphql.springbootgrapqlexample.dto;

import lombok.Data;

import java.util.Map;

@Data
public class GraphqlRequestBody {
	private String query;
	private String operationName;
	private Map<String, Object> variables;
}
