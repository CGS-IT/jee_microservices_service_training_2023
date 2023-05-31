package at.cgsit.jeemicro.resource;

import at.cgsit.jeemicro.resource.dto.SimpleDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.util.Random;

@Path("/createinfo")
public class CreateInfoService {

    @Inject
    Logger LOG;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("create info called ");

        Long l = new Random().nextLong();

        return l.toString();
    }

    @GET
    @Path("ext")
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleDTO helloSimpleDTO() {
        LOG.info("create info SimpleDTO called");

        SimpleDTO dto = new SimpleDTO();
        Long l = new Random().nextLong();

        dto.setValueA(l.toString());
        dto.setValueB(l.toString());
        return dto;
    }



}
