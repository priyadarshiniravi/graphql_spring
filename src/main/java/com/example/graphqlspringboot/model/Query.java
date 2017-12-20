package com.example.graphqlspringboot.model;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
