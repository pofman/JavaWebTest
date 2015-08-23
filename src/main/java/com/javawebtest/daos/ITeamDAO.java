package com.javawebtest.daos;

import com.javawebtest.model.Team;

import java.util.List;

/**
 * Created by martinmendez on 8/1/15.
 */
public interface ITeamDAO {

    public void Save(Team team);

    public List<Team> List();
}
