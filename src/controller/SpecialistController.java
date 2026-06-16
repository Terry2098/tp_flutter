<<<<<<< HEAD
package com.app.platform.controller;

import com.app.platform.entity.SpecialistProfile;
import com.app.platform.repository.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/specialists")
public class SpecialistController {

    @Autowired
    private SpecialistRepository specialistRepository;

    @GetMapping
    public List<SpecialistProfile> getAll() {
        return specialistRepository.findAll();
    }

    @PostMapping
    public SpecialistProfile create(@RequestBody SpecialistProfile profile) {
        return specialistRepository.save(profile);
    }
    
    // Ajouter ici les méthodes PUT et DELETE en utilisant specialistRepository.findById()...
=======
package com.app.platform.controller;

import com.app.platform.entity.SpecialistProfile;
import com.app.platform.repository.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/specialists")
public class SpecialistController {

    @Autowired
    private SpecialistRepository specialistRepository;

    @GetMapping
    public List<SpecialistProfile> getAll() {
        return specialistRepository.findAll();
    }

    @PostMapping
    public SpecialistProfile create(@RequestBody SpecialistProfile profile) {
        return specialistRepository.save(profile);
    }
    
    // Ajouter ici les méthodes PUT et DELETE en utilisant specialistRepository.findById()...
>>>>>>> 61a1cc0 (Premier commit)
}