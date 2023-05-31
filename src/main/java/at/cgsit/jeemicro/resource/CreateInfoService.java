package at.cgsit.jeemicro.resource;

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
}
