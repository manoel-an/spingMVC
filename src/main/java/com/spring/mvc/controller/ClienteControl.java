/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Cliente;

/**
 *
 * @author Manoel
 */
@Controller
public class ClienteControl {

	private Cliente cliente;

	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@RequestMapping("/index")
	public String controleIndex() {
		return "index";
	}

	@RequestMapping(value = "/clienteFormView", method = RequestMethod.GET)
	public String controleClienteFormView(Model model) {
		model.addAttribute("cliente", cliente);
		return "clienteFormView";
	}

	@RequestMapping(value = "/clienteSalvoView")
	public ModelAndView controleClienteSalvoView(Cliente cliente) {
		ModelAndView view = new ModelAndView("clienteSalvoView");
		view.addObject("cliente", cliente);
		return view;
	}

	// Exemplo de como ler uma variavel de um template na requisicao
	@RequestMapping(value = "/clienteFormView/{pag}")
	public String controleClienteFormView2(@PathVariable String pag, Model model) {
		if (pag.equals("dois")) {
			cliente.setNome(pag);
			cliente.setEmail(pag);
			cliente.setSexo(pag);
			cliente.setTelefone(pag);
		} else if (pag.equals("index")) {
			return "redirect:/index.html";
		} else {
			cliente = new Cliente();
		}
		model.addAttribute("cliente", cliente);
		return "clienteFormView";
	}

}
