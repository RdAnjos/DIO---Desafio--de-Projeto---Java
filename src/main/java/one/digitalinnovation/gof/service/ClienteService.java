package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
//import one.digitalinnovation.gof.model.Endereco;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

	//Endereco buscarPorCidade (Endereco cidade);


}
