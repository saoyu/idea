package com.shaoyu.service;

import com.shaoyu.pojo.People;

import java.io.IOException;
import java.util.List;

public interface PeopleService {

    List<People> show() throws IOException;
}
