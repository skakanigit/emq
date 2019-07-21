package com.raptors.emq.channel.impl;

import com.raptors.emq.channel.Channel;
import com.raptors.emq.model.Event;
import com.raptors.emq.sink.Sink;
import com.raptors.emq.sink.exception.SinkDownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author Sriram Kakani on 2019-07-20
 */

@ConditionalOnProperty(name = "channelType", havingValue = "memory")
@Service
public class MemoryChannel implements Channel {

	private static final Logger LOG = LoggerFactory.getLogger(MemoryChannel.class);

	private final Sink sink;

	@Autowired
	public MemoryChannel(Sink sink) {
		this.sink = sink;
	}

	@Override
	public void deliver(Event e) {

		try {
			sink.deliver(e);

		} catch (SinkDownException ex) {
			LOG.error("", ex);
		}
	}
}
