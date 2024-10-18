package com.labbs.secuserms.util;

import org.modelmapper.ModelMapper;

public class ConverterUtil {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static <D, T> D convertToDto(T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }
}
