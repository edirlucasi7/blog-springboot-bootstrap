package com.spring.blog.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.blog.model.Post;
import com.spring.blog.repository.CodeblogRepository;
import com.spring.blog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{

	@Autowired
	CodeblogRepository codeblogRepository;
	
	@Override
	public Page<Post> findAll(Pageable pageable) {
		Page<Post> list = codeblogRepository.findAll(pageable);
		return list;
	}

	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get(); 
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}
	
	@Override
	public void put(Long id, Post post, BindingResult result, RedirectAttributes attributes) {
		Optional<Post> optional = codeblogRepository.findById(id);
		if (optional.isPresent()) {
			Post postExiste = optional.get();
			postExiste.setAutor(post.getAutor());
			postExiste.setTexto(post.getTexto());
			postExiste.setTitulo(post.getTitulo());
			postExiste.setData(LocalDate.now());	
			codeblogRepository.save(postExiste);
		}
	}

	@Override
	public boolean delete(Long id) {
		Optional<Post> optional = codeblogRepository.findById(id);
		if (optional.isPresent()) {
			codeblogRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
}
