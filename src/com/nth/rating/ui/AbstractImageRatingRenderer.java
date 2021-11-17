package com.nth.rating.ui;

import com.nth.rating.JRating;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public abstract class AbstractImageRatingRenderer implements RatingRenderer {

    public abstract BufferedImage getFocusedAndMarkedImage();

    public abstract BufferedImage getFocusedImage();

    public abstract BufferedImage getMarkedImage();

    public abstract BufferedImage getUnmarkedImage();

    @Override
    public void paint(Graphics g, JRating c, int index,
            boolean marked, boolean selected, boolean focused) {
        if (marked) {
            if (focused) {
                g.drawImage(getFocusedAndMarkedImage(), 0, 0, null);
            } else {
                g.drawImage(getMarkedImage(), 0, 0, null);
            }
        } else {
            if (focused) {
                g.drawImage(getFocusedImage(), 0, 0, null);
            } else {
                g.drawImage(getUnmarkedImage(), 0, 0, null);
            }
        }

    }
}

