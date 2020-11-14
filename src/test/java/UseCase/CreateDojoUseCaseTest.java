package UseCase;

import Dojo.commands.CreateDojoCommand;
import Dojo.entities.Sensei;
import Dojo.enums.Frecuency;
import Dojo.enums.Status;
import Dojo.events.CreatedDojo;
import Dojo.valueObjects.*;
import ValueObjectsCommon.GroupGit;
import ValueObjectsCommon.NameGroupGit;
import ValueObjectsCommon.PathGroupGit;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class CreateDojoUseCaseTest extends UseCaseHandleBaseTest {
    @Test
    void createDojo_case() {
        List<Rule> rules = new ArrayList<>();

        rules.add(new Rule("Rule 1"));
        rules.add(new Rule("Rule 2"));

        DataInfo dataInfo = new DataInfo("Dojo1",
                "This is awesome dojo");

        GroupGit groupGit = new GroupGit(100,
                new PathGroupGit("Way Path"),
                new NameGroupGit("NameGroupGit"));

        Location location = new Location("www.meet.dojo.com",
                "Meet",
                "This is a description",
                new OpeningHours(10,
                        22,
                        Frecuency.MONTHLY));

        CreateDojoUseCase useCase = new CreateDojoUseCase();
        CreateDojoCommand command = new CreateDojoCommand(IdDojo.of("001"),
                dataInfo,
                //Status.OPEN,
                rules,
                groupGit,
                location);

        UseCaseHandler.getInstance()
                //.setIdentifyExecutor("HelloWorld")
                .asyncExecutor(useCase,
                        new RequestCommand<>(command))
                .subscribe(subscriber);

        verify(subscriber,
                times(1)).onNext(eventCaptor.capture());

        CreatedDojo event = (CreatedDojo)eventCaptor.getAllValues().get(0);
        Assertions.assertEquals("001", event.getEntityId().value());
        Assertions.assertEquals("Dojo1", event.getDataInfo().getName()); //event.getDataInfo().value().name()
        Assertions.assertEquals("This is awesome dojo", event.getDataInfo().getLegend());//event.getDataInfo().value().legend()


    }
}