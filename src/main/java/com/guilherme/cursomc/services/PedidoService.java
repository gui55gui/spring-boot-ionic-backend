package com.guilherme.cursomc.services;

import com.guilherme.cursomc.domain.Pedido;
import com.guilherme.cursomc.repositories.PedidoRepository;
import com.guilherme.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> Pedido = repo.findById(id);
        return Pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
