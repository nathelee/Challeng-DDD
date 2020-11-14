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
    void createDojo_case(){
        List<Rule> rules = new ArrayList<>();
        rules.add(new Rule("Rule 1"));
        rules.add(new Rule("Rule 2"));
        var useCase = new CreateDojoUseCase();
        var command = new CreateDojoCommand(IdDojo.of("001"),
                new DataInfo("Dojo1", "This is awesome dojo"),
                Status.OPEN, rules,
                new GroupGit(100,
                new PathGroupGit("Way Path"), new NameGroupGit("NameGroupGit")),
                new Location("www.meet.dojo.com", "Meet",
                        "This is a description",
                        new OpeningHours(10, 22, Frecuency.MONTHLY)));
        UseCaseHandler.getInstance()
                .setIdentifyExecutor("HelloWorld")
                .asyncExecutor(useCase, new RequestCommand<>(command))
                .subscribe(subscriber);

        verify(subscriber,times(1)).onNext(eventCaptor.capture());

        var event = (CreatedDojo)eventCaptor.getAllValues().get(0);
        Assertions.assertEquals("001", event.getEntityId().value());
        /*Assertions.assertEquals(1,eventCaptor.getAllValues());

        CreatedDojo createdDojo = (CreatedDojo) eventCaptor.getAllValues().get(0);*/
        System.out.println(event.getEntityId().value());
        System.out.println(event.getDataInfo().getClass());
        System.out.println(event.getDataInfo().toString());
        System.out.println(event.getDataInfo().value());
        System.out.println("Hola Hola");
        System.out.println(event.getGroupGit().value());
        System.out.println(event.getRules());
        System.out.println(event.getStatus());


    }
}