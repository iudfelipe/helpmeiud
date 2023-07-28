package com.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import com.edu.iudigital.helpmeiud.dto.request.DelitoDTORequest;
import com.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import com.edu.iudigital.helpmeiud.exceptions.RestException;

public interface IDelitoService {
  List<DelitoDTO> consultarTodos();

  DelitoDTO consultarPorId(Long id);

  DelitoDTO guardarDelito(DelitoDTORequest delitoDTORequest)  throws RestException;

  void borrarDelitoPorId(Long id);
  // TODO: metodos crud
}
