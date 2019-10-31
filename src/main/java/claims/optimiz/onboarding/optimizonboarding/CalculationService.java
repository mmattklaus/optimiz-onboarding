package claims.optimiz.onboarding.optimizonboarding;

import org.springframework.stereotype.Service;

interface CalcService {
    public int sum(int x, int y);
}

@Service
public class CalculationService implements CalcService {

    @Override
    public int sum(int x, int y) {
        return (x + y);
    }
}
