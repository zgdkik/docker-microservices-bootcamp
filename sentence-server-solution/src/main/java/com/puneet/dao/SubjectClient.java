/*
 * @author psachdev
 */
package com.puneet.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puneet.domain.Word;

/**
 * The Interface SubjectClient.
 */
@FeignClient("subject")
public interface SubjectClient {

	/**
	 * Gets the word.
	 *
	 * @return the word
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	Word getWord();
	
}
