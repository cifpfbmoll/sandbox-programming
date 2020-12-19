package com.studentsfp.devenvironment.unittesting.p1.data.competition;

import com.studentsfp.devenvironment.unittesting.p1.data.Person;

import java.util.Date;

/**
 * com.fbmoll.programming.data.competition
 * Class Match
 * 17/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Match {
    private Team localTeam;
    private Team visitorTeam;
    private Person referee;
    private Integer localScore;
    private Integer visitorScore;
    private Date matchDate;

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Team getWinner() {
        try{
            if(localScore.equals(visitorScore)){
                return null;
            }
            if (localScore > visitorScore) {
                return localTeam;
            }else{
                return visitorTeam;
            }
        }catch (Exception e){
            return null;
        }
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Person getReferee() {
        return referee;
    }

    public void setReferee(Person referee) {
        this.referee = referee;
    }

    public Integer getLocalScore() {
        return localScore;
    }

    public void setLocalScore(Integer localScore) {
        this.localScore = localScore;
    }

    public Integer getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(Integer visitorScore) {
        this.visitorScore = visitorScore;
    }
}
