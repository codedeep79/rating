package com.nth.rating.ui;

import java.awt.Point;

import javax.swing.plaf.ComponentUI;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public abstract class RatingUI extends ComponentUI {

    public abstract int getIndexAt(Point p);
}
