package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TweetDto;
import com.example.demo.entity.Tweet;
import com.example.demo.mapper.TweetMapper;
import com.example.demo.repository.TweetRepository;

@Service
public class TweetService {

	private TweetRepository tweetRepository;
	private TweetMapper tweetMapper;
	
	public TweetService(TweetRepository tweetRepository, TweetMapper tweetMapper) {
		this.tweetRepository = tweetRepository;
		this.tweetMapper = tweetMapper;
	}
	
	@Transactional
	public TweetDto createTweet(TweetDto tweetDto) {
		Tweet tweet = new Tweet();
		tweet.setActive(true);
		tweet.setAuthor(tweetDto.getAuthor());
		tweet.setContent(tweetDto.getContent());
		return tweetMapper.toDto(tweetRepository.save(tweet));
	}
	
	public TweetDto findById(long id) {
		return tweetMapper.toDto(tweetRepository.findById(id));
	}
	
}
