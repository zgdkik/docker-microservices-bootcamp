/*
 * @author psachdev
 */
package com.puneet.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puneet.domain.Word;

/**
 * The Interface NounClient.
 */
@FeignClient("noun")
public interface NounClient {

	/**
	 * Gets the word.
	 *
	 * @return the word
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	Word getWord();
	
}
