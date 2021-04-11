package com.techprimers.graphql.springbootgrapqlexample.model;

import com.techprimers.graphql.springbootgrapqlexample.enums.Gender;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
//@Table(name = "User")
//@Entity
@Value
public class User {
	private String id;
	private String firstName;
	private String lastName;
	private Gender gender;
}


