package com.netent.asg.repository;

import com.netent.asg.models.FreeRound;
import com.netent.asg.models.NormalRound;
import com.netent.asg.models.Rounds;
import com.netent.asg.models.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
public class PlayRepository {

    private Map<Long, Rounds> roundMap=new HashMap<Long,Rounds>();
    private ConcurrentMap<Long, User> userMap=new ConcurrentHashMap<Long,User>();

    PlayRepository(){
        Rounds normalRounds=new NormalRound();
        User user=new User(2312L,"deepak",10000L);
        roundMap.put(normalRounds.getId(),normalRounds);
        userMap.put(user.getId(),user);
    }

    public Rounds getRoundById(Long id){
        return roundMap.get(id);
    }
    public User getUserById(Long id){
        return userMap.get(id);
    }

    public int updateUser(User user){
        if(userMap.get(user.getId())!=null) {
            userMap.put(user.getId(), user);
            return 1;
        }
        else
            return 0;
    }

    public
}
