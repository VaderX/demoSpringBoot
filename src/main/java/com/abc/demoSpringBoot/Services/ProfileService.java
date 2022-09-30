package com.abc.demoSpringBoot.Services;

import com.abc.demoSpringBoot.Entity.Profile;
import com.abc.demoSpringBoot.Repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public void createProfile(Profile profile){
        profileRepository.save(profile);
    }

    public void updateProfile(Integer id){
        Profile updatedProfile = profileRepository.getReferenceById(id);
//        System.out.println("This is updated profile : " + updatedProfile);
        updatedProfile.setName("IDK");
        profileRepository.save(updatedProfile);
    }


}
