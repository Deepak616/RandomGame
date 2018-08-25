package com.netent.asg.models;

import com.netent.asg.enums.RoundType;

public class FreeRound extends Rounds {

    FreeRound(){
        super();
        super.id=987654321L;
        super.roundType= RoundType.FREE;
    }
}
