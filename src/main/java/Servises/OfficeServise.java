package Servises;

import amin.office.Dto.OfficeTmpDto;

public interface OfficeServise {

    OfficeTmpDto save(OfficeTmpDto officeTmpDto);

    OfficeTmpDto get(Long id);

    OfficeTmpDto update(OfficeTmpDto officeTmpDto);

    OfficeTmpDto delete(Long id);
}
