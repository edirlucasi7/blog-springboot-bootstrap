package com.spring.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.blog.model.Post;

public interface CodeblogService {

	Page<Post> findAll(Pageable pageable);
	Post findById(Long id);
	Post save(Post post);
	boolean delete(Long id);
	void put(Long id, Post post, BindingResult result, RedirectAttributes attributes);
}
