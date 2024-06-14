package Repository;

import Office.Officetmp;
import amin.office.Dto.OfficeTmpDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepo extends JpaRepository<Officetmp,Long> {

}
