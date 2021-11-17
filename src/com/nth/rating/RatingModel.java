package com.nth.rating;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public interface RatingModel {

    int getMarkCount();

    int getMaxCount();

    void setMarkCount(int markCount);

    void setMaxCount(int maxCount);

    void addRateListener(RatingListener listener);

    void removeRateListener(RatingListener listener);
}
