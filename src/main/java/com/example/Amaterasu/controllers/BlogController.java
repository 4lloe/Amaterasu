package com.example.Amaterasu.controllers;

import com.example.Amaterasu.models.Post;
import com.example.Amaterasu.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController
{
    @Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String blogMain(Model model)
    {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blogMain";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model)
    {
        return "blogAdd";
    }
}
