package com.netent.asg.models;

import com.netent.asg.enums.RoundType;

public abstract class Rounds {

    protected Long id;
    protected RoundType roundType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoundType getRoundType() {
        return roundType;
    }

    public void setRoundType(RoundType roundType) {
        this.roundType = roundType;
    }
}
