package claims.optimiz.onboarding.optimizonboarding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculationController {

    @Autowired
    CalculationService calculationService;

    @RequestMapping(value = "/{first}/{second}", method = RequestMethod.GET)
    public int sum(@PathVariable("first") int x, @PathVariable("second") int y) {
        return calculationService.sum(x, y);
    }
}
