package Servises.impl;

import Office.Officetmp;
import Repository.OfficeRepo;
import Servises.OfficeServise;
import amin.office.Dto.OfficeTmpDto;
import amin.office.mapper.OfficeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OfficeServiceImpl implements OfficeServise {

    private final OfficeMapper officeMapper;
    private final OfficeRepo officeRepo;

    @Autowired
    public OfficeServiceImpl(OfficeMapper officeMapper, OfficeRepo officeRepo) {
        this.officeMapper = officeMapper;
        this.officeRepo = officeRepo;
    }

    @Override
    public OfficeTmpDto save(OfficeTmpDto officeTmpDto) {
        Officetmp officetmp = officeMapper.fromDtoToEntity(officeTmpDto);
        officetmp.setId(null);
        officetmp = officeRepo.save(officetmp);
        return officeMapper.fromEntityToDto(officetmp);
    }

    @Override
    public OfficeTmpDto get(Long id) {
        Officetmp officetmp = officeRepo.findById(id).orElseThrow();
        return officeMapper.fromEntityToDto(officetmp);
    }

    @Override
    public OfficeTmpDto update(OfficeTmpDto officeTmpDto) {
        return null;
    }

    @Override
    public OfficeTmpDto delete(Long id) {
        return null;
    }

}
