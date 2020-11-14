package UseCase;

import Dojo.entities.Sensei;
import Dojo.events.AssignedSensei;
import co.com.sofka.business.annotation.EventListener;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

import java.util.logging.Logger;

@EventListener(eventType = "Dojo.AssignedSensei")
public class AssignSenseiUseCase extends UseCase<TriggeredEvent<AssignedSensei>, ResponseEvents> {

    private static final Logger logger = Logger.getLogger(AssignSenseiUseCase.class.getName());

    @Override
    public void executeUseCase(TriggeredEvent<AssignedSensei> assignedSenseiTriggeredEvent) {
        var event = assignedSenseiTriggeredEvent.getDomainEvent();
    }
}
