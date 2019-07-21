package com.raptors.emq.sink;

import com.raptors.emq.model.Event;
import com.raptors.emq.sink.exception.SinkDownException;

/**
 * @author Sriram Kakani on 2019-07-20
 */

public interface Sink {
    void deliver(Event e) throws SinkDownException;
}
