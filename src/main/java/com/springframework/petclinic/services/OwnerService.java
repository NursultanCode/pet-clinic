package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.repositories.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public List<Owner> findAll(){
        return ownerRepository.findAll();
    }

    public Owner findById(Long id) throws Exception {
        Optional<Owner> owner = ownerRepository.findById(id);
        if (owner.isPresent()){
            return owner.get();
        }else {
            //throw new UserAlreadyExistException("User already exist");
        }
        return null;
    }

    public Owner save(Owner owner){
        return ownerRepository.save(owner);
    }

    public void delete(Owner owner){
        ownerRepository.delete(owner);
    }

    public void deleteById(Long id){
        ownerRepository.deleteById(id);
    }

    public List<Owner> findByLastName(String lastName){
        return ownerRepository.findAllByLastName(lastName);
    }
}
