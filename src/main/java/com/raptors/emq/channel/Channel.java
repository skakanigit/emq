package com.raptors.emq.channel;

import com.raptors.emq.model.Event;

/**
 * @author Sriram Kakani on 2019-07-20
 */

public interface Channel {
    void deliver(Event e);
}
