package com.studentsfp.devenvironment.unittesting.controller;

import com.studentsfp.devenvironment.unittesting.data.Student;
import com.studentsfp.devenvironment.unittesting.p1.data.competition.CompetitionHelper;
import com.studentsfp.devenvironment.unittesting.p1.data.competition.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * com.studentsfp.devenvironment.unittesting.controller
 * Class RestStudentController
 * 09/09/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
@RestController
public class RestStudentController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/student")
    public Student getStudent(@RequestParam(value = "name", defaultValue = "Quijote") String name) {
        return new Student(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/getTeam")
    public Team getTeam(@RequestParam(value = "name", defaultValue = "Quijote") String name,
                        @RequestParam(value = "q", defaultValue = "12") Integer numPlayers) {
        Team team = new Team();
        team.setName(name);
        team.setPlayerList(CompetitionHelper.getRandomPlayers(numPlayers,name,""));
        return team;
    }

}
