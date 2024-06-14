package amin.office.mapper;

import Office.Officetmp;
import amin.office.Dto.OfficeTmpDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , uses = Officetmp.class)
public interface OfficeMapper {
    @Mapping(source = "provider.name", target = "provider")
    public OfficeTmpDto fromEntityToDto(Officetmp officetmp);

    @Mapping(source = "provider", target = "provider.name")
    public Officetmp fromDtoToEntity(OfficeTmpDto officeTmpDto);
}