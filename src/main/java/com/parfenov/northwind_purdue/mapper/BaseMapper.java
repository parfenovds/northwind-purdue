package com.parfenov.northwind_purdue.mapper;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<E, D> {

  D toDTO(E entity);

  E toEntity(D dto);

  List<D> toDtoList(Collection<E> entities);

  List<E> toEntityList(Collection<D> dtos);
}
