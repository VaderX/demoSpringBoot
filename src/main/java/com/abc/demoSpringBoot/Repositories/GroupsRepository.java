package com.abc.demoSpringBoot.Repositories;

import com.abc.demoSpringBoot.Entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Groups, Integer> {
}
