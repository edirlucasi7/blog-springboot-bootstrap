package com.spring.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.blog.model.Post;
import com.spring.blog.repository.CodeblogRepository;

@Component
public class DummyData {

	@Autowired
	CodeblogRepository codeblogRepository; 
	
	@PostConstruct
	public void savePosts() {
		
		if (!codeblogRepository.findAll().isEmpty()) return;
		
		List<Post> postlist = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Edir Lucas da Silva Icety Braga");
		post1.setData(LocalDate.now());
		post1.setTitulo("Lorem Ipsum");
		post1.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		
		Post post2 = new Post();
		post2.setAutor("Edir Lucas da Silva Icety Braga");
		post2.setData(LocalDate.now());
		post2.setTitulo("Lorem Ipsum");
		post2.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		Post post3 = new Post();
		post3.setAutor("Edir Lucas da Silva Icety Braga");
		post3.setData(LocalDate.now());
		post3.setTitulo("Lorem Ipsum");
		post3.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");		
		
		Post post4 = new Post();
		post4.setAutor("Edir Lucas da Silva Icety Braga");
		post4.setData(LocalDate.now());
		post4.setTitulo("Lorem Ipsum");
		post4.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		Post post5 = new Post();
		post5.setAutor("Edir Lucas da Silva Icety Braga");
		post5.setData(LocalDate.now());
		post5.setTitulo("Lorem Ipsum");
		post5.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		
		Post post6 = new Post();
		post6.setAutor("Edir Lucas da Silva Icety Braga");
		post6.setData(LocalDate.now());
		post6.setTitulo("Lorem Ipsum");
		post6.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		Post post7 = new Post();
		post7.setAutor("Edir Lucas da Silva Icety Braga");
		post7.setData(LocalDate.now());
		post7.setTitulo("Lorem Ipsum");
		post7.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		Post post8 = new Post();
		post8.setAutor("Edir Lucas da Silva Icety Braga");
		post8.setData(LocalDate.now());
		post8.setTitulo("Lorem Ipsum");
		post8.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		
		Post post9 = new Post();
		post9.setAutor("Edir Lucas da Silva Icety Braga");
		post9.setData(LocalDate.now());
		post9.setTitulo("Lorem Ipsum");
		post9.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		Post post10 = new Post();
		post10.setAutor("Edir Lucas da Silva Icety Braga");
		post10.setData(LocalDate.now());
		post10.setTitulo("Lorem Ipsum");
		post10.setTexto("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		
		postlist.add(post1);
		postlist.add(post2);
		postlist.add(post3);
		postlist.add(post4);
		postlist.add(post5);
		postlist.add(post6);
		postlist.add(post7);
		postlist.add(post8);
		postlist.add(post9);
		postlist.add(post10);
		
		for (Post post : postlist) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
		
	}
}
