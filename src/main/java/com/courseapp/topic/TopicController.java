package com.courseapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return Arrays.asList(
            new Topic("Java", "Java Master Class", "This is a Java masterclass"),
            new Topic("Node js", "Node js Master Class", "This is a Node js masterclass"),
            new Topic("Golang", "Golang Master Class", "This is a Golang masterclass")
        );
    }
}






