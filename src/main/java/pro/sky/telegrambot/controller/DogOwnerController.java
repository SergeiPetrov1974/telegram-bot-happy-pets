package pro.sky.telegrambot.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.telegrambot.model.Owner;
import pro.sky.telegrambot.service.OwnerService;

import java.util.Collection;

@RestController
@RequestMapping("/dog-owner")
public class DogOwnerController {
    private final OwnerService ownerService;

    public DogOwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @GetMapping("/{id}")
    public Owner getOwnerInfo(@PathVariable Long id) {
        return ownerService.findOwner(id);
    }

    @PutMapping
    public Owner editOwner(@RequestBody Owner owner) {
        return ownerService.editOwner(owner);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
    }

    @GetMapping
    public Collection<Owner> getAllOwner() {
        return ownerService.getAllOwner();
    }
}
