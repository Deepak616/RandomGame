package com.netent.asg.controller;

import com.netent.asg.models.RoundReward;
import com.netent.asg.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {

    @Autowired
    private PlayService playService;

    @PostMapping("/v1/playRound")
    public ResponseEntity<RoundReward> playRound(@RequestParam("userId") Long userId,@RequestParam("roundId") Long roundId) {
        RoundReward roundReward = playService.playRound(roundId, userId);
        return ResponseEntity.ok(roundReward);
    }
}
