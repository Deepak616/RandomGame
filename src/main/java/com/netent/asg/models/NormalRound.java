package com.netent.asg.models;

import com.netent.asg.enums.RewardType;
import com.netent.asg.enums.RoundType;

public class NormalRound extends Rounds {

    public NormalRound(){
        super();
        super.id=123456789L;
        super.roundType= RoundType.NORMAL;
        super.cost=10;
    }

    @Override
    public RoundReward getRoundRewardForPercentage(int percentAmount) {
        if(percentAmount<=10)
            return new RoundReward(RewardType.ROUND,RoundType.FREE);
        else if(percentAmount > 10 && percentAmount <=30)
            return new RoundReward(RewardType.COIN,20);
        else
            return new RoundReward(RewardType.NONE,null);
    }
}
