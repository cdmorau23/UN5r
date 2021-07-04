package com.UN5.market.persistence.mapper;

import com.UN5.market.domain.AdminRest;
import com.UN5.market.persistence.entity.AdminRestaurante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses={RestMapper.class})
public interface AdminRestMapper {
    @Mappings({
            @Mapping(source = "id.idAdmin", target = "adminId")


    })
    AdminRest toAdminRest(AdminRestaurante  admin);
    @InheritInverseConfiguration
    @Mappings({

            @Mapping(target = "administrador", ignore=true),
            @Mapping(target = "restaurante", ignore=true),
            @Mapping(target = "id.idRestaurante", ignore = true)

    })
    AdminRestaurante toAdminRestaurante(AdminRest rest);
}
