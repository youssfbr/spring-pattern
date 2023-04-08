package com.github.youssfbr.gof.service;

import com.github.youssfbr.gof.model.Cliente;

/**
 * Interface que define o padrao <b>Strategy</b> no dominio de cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma interface. *
 */

public interface IClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
