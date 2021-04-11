# Spring Boot with GraphQL Query Example

Update: Upgraded to Java 11 and Graph QL to 5+ version dependency

## Book Store
- `/rest/books` is the REST resource which can fetch Books information
- DataFetchers are Interfaces for RuntimeWiring of GraphQL with JpaRepository

## Sample GraphQL Scalar Queries
- Accessible under `http://localhost:8091/rest/books`
- Usage for `allBooks`
```
{
   allBooks {
     isn
     title
     authors
     publisher
   }
 }
```
- Usage for `book`
```
  {
   book(id: "123") {
     title
     authors
     publisher
   }
```
- Combination of both `allBooks` and `book`
```
{
   allBooks {
     title
     authors
   }
   book(id: "124") {
     title
     authors
     publisher
   }
 }
```

## Useful tutorials
- Spring Boot GraphQL Tutorial #6
- https://www.youtube.com/watch?v=AI4JGDI3zG4&list=PL0mgqHWxwZciKccW2CuDX6NNMOZ7ONaH4

## Specific direction
- Add extension in chrome for Altair client, a substitute for postman.
- API `http://localhost:8091/api/v1/books`