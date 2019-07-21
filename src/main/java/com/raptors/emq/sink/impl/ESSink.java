package com.raptors.emq.sink.impl;

import com.raptors.emq.model.Event;
import com.raptors.emq.sink.Sink;
import com.raptors.emq.sink.exception.SinkDownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author Sriram Kakani on 2019-07-20
 */

@ConditionalOnProperty(name = "sinkType", havingValue = "es")
@Service
public class ESSink implements Sink {

	private static final Logger LOG = LoggerFactory.getLogger(ESSink.class);

	@Override
	public void deliver(Event e) throws SinkDownException {
		try {

		} catch (Exception ex) {
			throw new SinkDownException(ex.getMessage(), ex);
		}
	}
}
