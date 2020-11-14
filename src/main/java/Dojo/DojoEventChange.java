package Dojo;

import Dojo.entities.Sensei;
import Dojo.enums.Status;
import Dojo.events.AssignedSensei;
import Dojo.events.CreatedDojo;
import Dojo.valueObjects.IdSensei;
import Dojo.valueObjects.Location;
import Dojo.valueObjects.OpeningHours;
import ValueObjectsCommon.GroupGit;
import co.com.sofka.domain.generic.EventChange;

public class DojoEventChange extends EventChange {
    public DojoEventChange(Dojo dojo){
        apply((CreatedDojo event) -> {
            dojo.dataInfo = event.getDataInfo();
            dojo.status = Status.CLOSED;
            dojo.rules = event.getRules();
            dojo.groupGit = new GroupGit(
                    event.getGroupGit().value().groupId(),
                    event.getGroupGit().value().path(),
                    event.getGroupGit().value().name()
            );
            dojo.location = new Location(
                    event.getLocation().value().urlMeet(),
                    event.getLocation().value().location(),
                    event.getLocation().value().description(),
                    new OpeningHours(
                            event.getLocation().value().openingHours().value().hourStart(),
                            event.getLocation().value().openingHours().value().hourEnd(),
                            event.getLocation().value().openingHours().value().frecuency()
                    )
            );
        });

        apply((AssignedSensei event) -> {
            dojo.sensei = new Sensei(event.getIdSensei(), event.getNameSensei(),
                    event.getPersonIdSensei(), event.getSpecialty(),
                    event.getMemberGit(), event.getAccomplishments());
        });
    }
}
