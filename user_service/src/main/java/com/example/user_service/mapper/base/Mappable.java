package com.example.user_service.mapper.base;

import java.util.List;

public interface Mappable<E,D> {
    D toDto(E e);
    E toEntity(D d);

    List<D> toDtos(Iterable<E> e);
    List<E> toEntities(Iterable<D> d);
}
