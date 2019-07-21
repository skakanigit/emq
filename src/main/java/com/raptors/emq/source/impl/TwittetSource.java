package com.raptors.emq.source.impl;

import com.raptors.emq.channel.Channel;
import com.raptors.emq.model.Event;
import com.raptors.emq.source.EventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;


/**
 * @author Sriram Kakani on 2019-07-20
 */

@ConditionalOnProperty(name = "sourceType", havingValue = "twitter")
@Service
public class TwittetSource implements EventSource {

	private static final Logger LOG = LoggerFactory.getLogger(TwittetSource.class);

	private final Channel channel;

	@Autowired
	public TwittetSource(Channel channel){
		this.channel = channel;
	}

	@Override
	public void deliver(Event event) {
		try {
			Event e = new Event();
			channel.deliver(e);
		} catch (Exception ex) {
			LOG.error("", ex);
		}
	}
}
