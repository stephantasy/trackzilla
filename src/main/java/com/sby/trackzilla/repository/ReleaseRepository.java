package com.sby.trackzilla.repository;

import com.sby.trackzilla.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}