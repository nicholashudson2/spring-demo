package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TweetDto;
import com.example.demo.service.TweetService;

@RestController
public class TweetController {

	private TweetService tweetService;
	
	public TweetController(TweetService tweetService) {
		this.tweetService = tweetService;
	}
	
	@PostMapping("tweet")
	public TweetDto postTweet(@RequestBody TweetDto tweetDto, HttpServletResponse response) {
		if(tweetDto.getContent() == null || tweetDto.getContent().equals("")) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		return tweetService.createTweet(tweetDto);
	}
	
	@GetMapping("tweet/{id}")
	public TweetDto findById(@PathVariable long id) {
		return tweetService.findById(id);
	}
	
}
