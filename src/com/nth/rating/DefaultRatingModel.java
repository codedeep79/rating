package com.nth.rating;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public class DefaultRatingModel implements RatingModel {

    private int maxCount;
    private int markCount;

    private List<RatingListener> listeners;

    public DefaultRatingModel() {
        this(5);
    }

    public DefaultRatingModel(int maxCount) {
        this(maxCount, 0);
    }

    public DefaultRatingModel(int maxCount, int markCount) {
        this.maxCount = maxCount;
        this.markCount = markCount;
        listeners = new ArrayList<>();
    }

    @Override
    public int getMarkCount() {
        return markCount;
    }

    @Override
    public int getMaxCount() {
        return maxCount;
    }

    @Override
    public void setMarkCount(int markCount) {
        if (this.markCount != markCount) {
            if (markCount < 0 || markCount > maxCount) {
                throw new IllegalArgumentException(String.valueOf(markCount));
            }
            this.markCount = markCount;
            fireIndexChanged();
        }
    }

    @Override
    public void setMaxCount(int maxCount) {
        if (this.maxCount != maxCount) {
            if (maxCount < 1) {
                throw new IllegalArgumentException(String.valueOf(maxCount));
            }
            this.maxCount = maxCount;
            fireMaxCountChanged();
        }
    }

    private void fireIndexChanged() {
        RatingEvent event = null;
        for (RatingListener listener : listeners) {
            if (event == null) {
                event = new RatingEvent(this, getMarkCount(), getMaxCount());
            }
            listener.indexChanged(event);
        }
    }

    private void fireMaxCountChanged() {
        RatingEvent event = null;
        for (RatingListener listener : listeners) {
            if (event == null) {
                event = new RatingEvent(this, getMarkCount(), getMaxCount());
            }
            listener.maxCountChanged(event);
        }
    }

    @Override
    public void addRateListener(RatingListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeRateListener(RatingListener listener) {
        listeners.remove(listener);
    }

}
