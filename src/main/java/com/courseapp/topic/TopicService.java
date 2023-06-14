package com.courseapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1gt67u", "Java Master Class", "This is a Java masterclass"),
            new Topic("86cbdy", "Node js Master Class", "This is a Node js masterclass"),
            new Topic("8h64gd", "Golang Master Class", "This is a Golang masterclass"),
            new Topic("4olsdh", "Rust Master Class", "This is a Rust masterclass")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter(el -> el.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    
    
}
