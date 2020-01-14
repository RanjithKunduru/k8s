package com.avigna.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	
	@GetMapping(path="/products")
	public String callMe()
	{
		return "All are products!!";
	}

}
