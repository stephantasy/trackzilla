package com.sby.trackzilla.service;

import com.sby.trackzilla.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


