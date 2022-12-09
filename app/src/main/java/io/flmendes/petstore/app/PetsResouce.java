package io.flmendes.petstore.app;

import io.flmendes.petstore.api.PetsApi;
import io.flmendes.petstore.model.Pet;

import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class PetsResouce implements PetsApi {

    @Override
    public void createPets() {

    }

    @Override
    public List<Pet> listPets(Integer limit) {
        return null;
    }

    @Override
    public Pet showPetById(String petId) {
        return null;
    }
}
