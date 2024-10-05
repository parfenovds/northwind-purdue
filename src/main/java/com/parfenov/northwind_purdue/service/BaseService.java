package com.parfenov.northwind_purdue.service;

import com.parfenov.northwind_purdue.dto.BaseDTO;
import java.io.Serializable;
import java.util.List;

public interface BaseService<K extends Serializable, E extends BaseDTO> {

  E findById(K id);

}
