package calculator.service;

import calculator.entity.Num;
import calculator.entity.Separator;
import java.util.List;
import java.util.Set;

public interface SeparatorService {

    List<Num> separateNum(String input, String separatorString);

    Set<Separator> getCustomSeparators(String input);

    String refineString(Set<Separator> separatorSet);
}
