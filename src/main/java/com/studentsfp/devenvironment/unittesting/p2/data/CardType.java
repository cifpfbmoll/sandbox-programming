package com.studentsfp.devenvironment.unittesting.p2.data;

import org.apache.commons.lang3.StringUtils;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class CardType
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public enum CardType {
    DEBIT, CREDIT;

    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(super.toString());
        //return super.toString();
    }
}
