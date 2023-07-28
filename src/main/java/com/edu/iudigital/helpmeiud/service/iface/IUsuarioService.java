package com.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import com.edu.iudigital.helpmeiud.dto.request.UsuarioDTORequest;
import com.edu.iudigital.helpmeiud.dto.response.UsuarioDTO;
import com.edu.iudigital.helpmeiud.exceptions.RestException;
import com.edu.iudigital.helpmeiud.model.Usuario;

public interface IUsuarioService {

    List<UsuarioDTO> consultarTodos();

    UsuarioDTO consultarPorId(Long id);

    UsuarioDTO consultarPorUsername(String username);

    Usuario findByUsername(String username);

    UsuarioDTO guardar(UsuarioDTORequest usuarioDTORequest) throws RestException;
}
