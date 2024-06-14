package Controller;

import Servises.OfficeServise;
import amin.office.Dto.OfficeTmpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;

@RestController
public class Controller {

    private OfficeServise officeServise;

    @Autowired
    public Controller(OfficeServise officeServise) {
        this.officeServise = officeServise;
    }

    @PostMapping("/create")
    public OfficeTmpDto create(@RequestBody OfficeTmpDto officeTmpDto) {
        return officeServise.save(officeTmpDto);
    }

    @GetMapping("/getById/{id}")
    public OfficeTmpDto getById(@PathVariable Long id) {
        return officeServise.get(id);
    }
    @PutMapping("/update")
    public OfficeTmpDto update(@RequestBody OfficeTmpDto officeTmpDto){
        return officeServise.update(officeTmpDto);

    }
    @DeleteMapping("/delete/{id}")
    public OfficeTmpDto delete(@PathVariable Long id){
        return officeServise.delete(id);
    }
}
