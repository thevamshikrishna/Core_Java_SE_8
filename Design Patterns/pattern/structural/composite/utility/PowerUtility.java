package pl.vm.javaguild.designpatterns.pattern.structural.composite.utility;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.vm.javaguild.designpatterns.pattern.structural.composite.Item;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PowerUtility {

    public static final Long COMMON_POWER = 10L;
    public static final Long RARE_POWER = 50L;
    public static final Long UNIQUE_POWER = 75L;
    public static final Long LEGENDARY_POWER = 100L;

    public static Long calculatePower(List<Item> items) {
        return items.stream()
                .map(Item::getPower)
                .reduce(0L, Long::sum);
    }
}
