package com.netent.asg.models;

import com.netent.asg.enums.RewardType;

public class RoundReward {

    private RewardType rewardType;
    private Object value;

    public RoundReward(RewardType rewardType, Object value) {
        this.rewardType = rewardType;
        this.value = value;
    }

    public RewardType getRewardType() {
        return rewardType;
    }

    public void setRewardType(RewardType rewardType) {
        this.rewardType = rewardType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
