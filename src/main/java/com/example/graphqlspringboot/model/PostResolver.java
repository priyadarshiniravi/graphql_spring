package com.example.graphqlspringboot.model;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public Optional<Author> getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }
}
