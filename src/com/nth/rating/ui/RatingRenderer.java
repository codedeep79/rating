package com.nth.rating.ui;

import com.nth.rating.JRating;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public interface RatingRenderer {

    void paint(Graphics g, JRating c, int index,
            boolean marked, boolean selected, boolean focused);

    Dimension getMarkSize();

}
