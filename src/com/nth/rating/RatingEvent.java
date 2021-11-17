package com.nth.rating;

import java.util.EventObject;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public class RatingEvent extends EventObject {

    private static final long serialVersionUID = 1L;

    private final int markCount;
    private final int maxCount;

    public RatingEvent(Object source, int markCount, int maxCount) {
        super(source);
        this.markCount = markCount;
        this.maxCount = maxCount;
    }

    public int getMarkCount() {
        return markCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

}
