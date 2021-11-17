package com.nth.rating;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public interface RatingListener {

    public void indexChanged(RatingEvent event);

    public void maxCountChanged(RatingEvent event);
}
