package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import ch.qos.logback.core.status.StatusListenerAsList;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Smartphone Xiaomi Redmi Note 9S");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61ShPQu-u0L._AC_SL1200_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-9S/dp/B085S47W3M/ref=sr_1_5?__"
				+ "mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=celular&qid=1614620997&sr=8-5");
		pedido.setDescricao("Versão Global - Aurora Blue");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		//TESTE
		return "home";
	}

}
