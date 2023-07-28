package com.edu.iudigital.helpmeiud.service.iface;

import com.edu.iudigital.helpmeiud.dto.CasoDTO;
import com.edu.iudigital.helpmeiud.exceptions.RestException;
import com.edu.iudigital.helpmeiud.model.Caso;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> consultarTodos();

    Caso crear(CasoDTO casoDTO) throws RestException;

    Boolean visible(Boolean visible, Long id);

    CasoDTO consultarPorId(Long id);
}