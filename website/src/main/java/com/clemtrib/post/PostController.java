package com.clemtrib.post;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/hello")
	public Post post(@RequestParam(value="name", defaultValue="World") String name) {
		return new Post(counter.incrementAndGet(), String.format(template, name), String.format(template, name));
	}
	
}