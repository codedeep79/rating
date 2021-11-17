package com.nth.rating;

import com.nth.rating.ui.RenderBasedRatingUI;
import com.nth.rating.ui.StarRenderer;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 17, 2021
 */
public class RatingDemo extends JFrame {

    private static final long serialVersionUID = 1L;

    public RatingDemo() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rating");

        getContentPane().setLayout(new GridLayout(4, 2));

        getContentPane().add(new JLabel("1:"));
        JRating rating1 = new JRating();

        getContentPane().add(rating1);

        getContentPane().add(new JLabel("2:"));
        JRating rating2 = new JRating();
        rating2.getModel().setMaxCount(3);
        rating2.setUI(new RenderBasedRatingUI(new StarRenderer(32)));
        getContentPane().add(rating2);

        getContentPane().add(new JLabel("3:"));
        getContentPane().add(new JRating());

        getContentPane().add(new JLabel("4:"));
        getContentPane().add(new JRating());
        pack();
        setLocationByPlatform(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
            new RatingDemo().setVisible(true);
        });
    }
}
