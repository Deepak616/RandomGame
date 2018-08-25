package com.netent.asg.models;

import com.netent.asg.enums.RoundType;

public class NormalRound extends Rounds {

    NormalRound(){
        super();
        super.id=123456789L;
        super.roundType= RoundType.NORMAL;
        super.cost=10;
    }

    @Override
    public int calculatePercentage() {
        return 0;
    }

    @Override
    public RoundReward getRoundRewardForPercentage(int percentAmount) {
        return null;
    }
}
