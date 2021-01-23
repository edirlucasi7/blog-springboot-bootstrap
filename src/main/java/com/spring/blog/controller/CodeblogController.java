package com.spring.blog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.blog.model.Post;
import com.spring.blog.service.CodeblogService;

@RestController
@RequestMapping("")
public class CodeblogController {

	@Autowired
	CodeblogService codeblogService;
	
	@GetMapping("/posts")
	public ModelAndView getPosts(@RequestParam(value = "page", defaultValue = "0") Integer page,
								 @RequestParam(value = "size", defaultValue = "5") Integer size) {
		ModelAndView mv = new ModelAndView("posts");
		Page<Post> posts = codeblogService.findAll(PageRequest.of(page, size));
		mv.addObject("posts", posts);
		return mv;
	}
	
	@GetMapping("/post/{id}")
	public ModelAndView getPostDetails(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = codeblogService.findById(id);
		mv.addObject("post", post);
		return mv;
	}
	
	@GetMapping("/newpost")
	public ModelAndView getPostForm() {
		return new ModelAndView("postForm");
	}
	 	
	@PostMapping("/newpost")
	public ModelAndView savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
			return new ModelAndView("redirect:/newpost");
		}
		post.setData(LocalDate.now());
		codeblogService.save(post);
		attributes.addFlashAttribute("mensagemSucesso", "Adicionado com Sucesso!");
		return new ModelAndView("redirect:/newpost");
	}
	
	@GetMapping("/editarPosts/{id}")
	public ModelAndView update(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("atualizaPost");
		Post post = codeblogService.findById(id);
		mv.addObject("post", post);
		return mv;
	}
	
	@PostMapping("/editarPost/{id}")
	public ModelAndView putPost(@PathVariable("id") Long id, @Valid Post post, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return new ModelAndView("redirect:/editarPosts/" + id);
		}
		codeblogService.put(id, post, result, attributes);
		attributes.addFlashAttribute("mensagemSucesso", "Atualizado com sucesso!");
		return new ModelAndView("redirect:/editarPosts/" + id);
	}
	
	@GetMapping("/deletar")
	public ModelAndView deletarPost(Long id) {
		Boolean ok = codeblogService.delete(id);
		if (ok) {
			return new ModelAndView("redirect:/posts");
		}
		return new ModelAndView("redirect:/posts");
	}
	
}
