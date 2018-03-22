package com.samsung.business.spaceinvaders.entity;

import com.badlogic.gdx.Gdx;
import com.samsung.business.spaceinvaders.manager.GraphicsManager;
import com.samsung.business.spaceinvaders.ui.DisplayInfo;

/**
 * Created by lb_lb on 05.11.17.
 */
public class PlayerShoot extends Shoot {
    private static final int HEIGHT = DisplayInfo.getHeight();

    public PlayerShoot(GraphicsManager.Graphics graphics, float originX, float originY) {
        super(graphics, originX, originY);
    }

    @Override
    public boolean isOutsideScreen() {
        //todo sprawdzenie czy pocisk wylecial za gorna krawedz ekranu
        return this.position.y + 10 > 0;
    }

    @Override
    public void updateState() {
        this.position.y += 200 * Gdx.graphics.getDeltaTime();
    }


}
