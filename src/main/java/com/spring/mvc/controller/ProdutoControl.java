package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Produto;

@Controller
public class ProdutoControl {

	private Produto produto;

	@Autowired
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@RequestMapping(value = "/produtoFormView", method = RequestMethod.GET)
	public String controleProdutoFormView(Model model) {
		model.addAttribute("produto", produto);
		return "produtoFormView";
	}

	@RequestMapping(value = "/produtoSalvoView")
	public ModelAndView controleProdutoSalvoView(Produto produto) {
		ModelAndView view = new ModelAndView("produtoSalvoView");
		view.addObject("produto", produto);
		return view;
	}

	@RequestMapping("/produtoSalvoViewRP")
	public ModelAndView controleProdutoSalvoRequestParam(@RequestParam(value = "name", required = false) String name) {
		// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("produtoSalvoView");
		produto.setCodigo(1l);
		produto.setNome(name);
		produto.setPreco(20d);
		view.addObject("produto", produto);
		return view;
	}

}
