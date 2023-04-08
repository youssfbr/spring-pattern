package com.github.youssfbr.gof.service;

import com.github.youssfbr.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IViaCepService {

    // @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    @GetMapping("/{cep}/json")
    Endereco consultarCEP(@PathVariable("cep") String cep);

}
