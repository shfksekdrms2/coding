package com.seowon.coding.util;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

@UtilityClass
public class PolicyInner {

    public boolean includeTax = true;
    public RoundingMode policyRoundingMode = RoundingMode.HALF_UP;

    public BigDecimal policy(double percentage) {
        return BigDecimal.valueOf(percentage)
                .setScale(2, policyRoundingMode);
    }
}
