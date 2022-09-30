package com.abc.demoSpringBoot.Services;

import com.abc.demoSpringBoot.Entity.Groups;
import com.abc.demoSpringBoot.Repositories.GroupsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupsRepository groupsRepository;

    public GroupService(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }

    public List<Groups> getGroups(){
        return groupsRepository.findAll();
    }
}
