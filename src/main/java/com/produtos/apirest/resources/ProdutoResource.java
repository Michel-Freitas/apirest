package com.produtos.apirest.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.produtos.apirest.models.Produto;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*") //Server para restringir o acesso a API, nesse caso qualquer dominio pode acessar
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna a lista de produtos cadastrados")
	public java.util.List<Produto> listarProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produtos/{idProduto}")
	@ApiOperation(value="Retorna os detalhes do produto")
	public Optional<Produto> detalhesProduto(@PathVariable(value="idProduto") Integer id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produtos")
	@ApiOperation(value="Salva o produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produtos")
	@ApiOperation(value="Deleta o produto selecionado")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produtos")
	@ApiOperation(value="Atualiza os dados do produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
