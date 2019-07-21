package com.raptors.emq.source;

import com.raptors.emq.model.Event;

/**
 * @author Sriram Kakani on 2019-07-20
 */


public interface EventSource {
	void deliver(Event event);
}
