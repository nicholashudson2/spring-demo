package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.TweetDto;
import com.example.demo.entity.Tweet;

@Mapper(componentModel="spring")
public interface TweetMapper {

	Tweet fromDto(TweetDto dto);
	
	List<Tweet> fromDtos(List<TweetDto> dtos);
	
	TweetDto toDto(Tweet tweet);
	
	List<TweetDto> toDto(List<Tweet> tweet);
	
}
