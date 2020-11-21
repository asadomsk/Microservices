package consumer.client;

import consumer.model.ActionEventDto;

public interface ConsumerClient {
	void save (ActionEventDto actionEventDto);
}
