package com.abc.demoSpringBoot.Controller;

import com.abc.demoSpringBoot.Entity.Groups;
import com.abc.demoSpringBoot.Entity.Post;
import com.abc.demoSpringBoot.Entity.Profile;
import com.abc.demoSpringBoot.Services.GroupService;
import com.abc.demoSpringBoot.Services.PostService;
import com.abc.demoSpringBoot.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {
    private final ProfileService profileService;
    private final PostService postService;
    private final GroupService groupService;

    public AppController(ProfileService profileService, PostService postService, GroupService groupService) {
        this.profileService = profileService;
        this.postService = postService;
        this.groupService = groupService;
    }

    @GetMapping("/profiles")
    public List<Profile> getProfiles() {
        return profileService.getProfiles();
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return  postService.getPosts();
    }

    @GetMapping("/groups")
    public List<Groups> getGroups(){
        return groupService.getGroups();
    }

    @PostMapping("/addProfile")
    public String createProfile(@RequestBody Profile profile){
        profileService.createProfile(profile);
        return "New profile is saved.";
    }

    @PutMapping("/updateProfile/{id}")
    public String updateProfile(@PathVariable Integer id){
        profileService.updateProfile(id);
        return "Profile data has been updated :) ";
    }

}
