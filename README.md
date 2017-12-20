# graphql-example
GraphQL Example from http://www.baeldung.com/spring-graphql

# Steps
* Run the app from intellij
* GraphQL server is started
* GraphQL server is started and ready to be queried (localhost:8080/graphql)
* Query example 
``` 
query {
    recentPosts(count: 10, offset: 0) {
        id
        title
        category
        author {
            id
            name
            thumbnail
        }
    }
}
```

