
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.core.MediaType;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/user")
public class TestController {
    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public User getSingleUser() {
        LOGGER.info("#########INFO####################DADADADADADADAFA##########################################");
        LOGGER.debug("########DEBUG#####################DADADADADADADAFA##########################################");
        LOGGER.debug("########WARN#####################DADADADADADADAFA##########################################");
        LOGGER.debug("########ERROR#####################DADADADADADADAFA##########################################");
        User user = new User();
        user.setId(11l);
        user.setFirstName("Anil");
        user.setLastName("Kamal");
        return user;
    }
}
