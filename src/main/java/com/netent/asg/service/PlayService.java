package com.netent.asg.service;

import com.netent.asg.repository.PlayRepository;
import com.netent.asg.util.AsgUtil;
import com.netent.asg.enums.RewardType;
import com.netent.asg.enums.RoundType;
import com.netent.asg.models.RoundReward;
import com.netent.asg.models.Rounds;
import com.netent.asg.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayService {

    @Autowired
    private PlayRepository playRepository;

    public RoundReward playRound(Long roundId,Long userId){
        Rounds round=playRepository.getRoundById(roundId);
        User user=playRepository.getUserById(userId);
        if(round!=null && user!=null) {
            if (round.getRoundType() == RoundType.NORMAL) {
                user.setTotalCoins(user.getTotalCoins() - 10);
            }
            int percentAmount = AsgUtil.generateRandomNumbersBetween(1, 100);
            RoundReward roundReward = round.getRoundRewardForPercentage(percentAmount);
            updateUserStatistics(roundReward, user);
            playRepository.updateUser(user);
            return roundReward;
        }
        else{
            return null;
        }
    }

    private void updateUserStatistics(RoundReward roundReward,User user) {
        if(roundReward.getRewardType()==RewardType.COIN){
            user.setRoundsWon(user.getRoundsWon()+1);
            user.setTotalCoins(user.getTotalCoins()+20);
        }
        else if(roundReward.getRewardType()==RewardType.NONE){
            user.setRoundsLost(user.getRoundsLost()+1);
        }
        user.setRoundsPlayed(user.getRoundsPlayed()+1);
    }
}
