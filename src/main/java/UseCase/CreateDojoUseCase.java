package UseCase;

import Dojo.commands.AssignSenseiCommand;
import Dojo.commands.CreateDojoCommand;
import Dojo.Dojo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateDojoUseCase extends UseCase<RequestCommand<CreateDojoCommand>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CreateDojoCommand> createDojoRequestCommand) {
        var command = createDojoRequestCommand.getCommand();
        var dojo = new Dojo(command.getIdDojo(), command.getDataInfo(),
                command.getStatus(), command.getRules(), command.getGroupGit(),
                command.getLocation());
        //command.getSen

        emit().onSuccess(new ResponseEvents(dojo.getUncommittedChanges()));
    }
}
