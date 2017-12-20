package com.example.graphqlspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class PostDao {
    private List<Post> posts;

    public List<Post> getRecentPosts(int count, int offset) {
        return posts.stream()
            .skip(offset)
            .limit(count)
            .collect(Collectors.toList());
    }

    public List<Post> getAuthorPosts(String author) {
        return posts.stream()
            .filter(post -> author.equals(post.getAuthorId()))
            .collect(Collectors.toList());
    }

    public void savePost(Post post) {
        posts.add(0, post);
    }
}
