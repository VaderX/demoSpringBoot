package com.abc.demoSpringBoot.Repositories;

import com.abc.demoSpringBoot.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
