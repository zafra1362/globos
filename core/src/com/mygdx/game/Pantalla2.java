package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

import java.util.ArrayList;

public class Pantalla2 extends BaseScreen{

    SpriteBatch spriteBatch;
    Texture globo;
    int xr, xv, xa;
    int yr, yv, ya;
    public Pantalla2(MyGdxGame game) {
        super(game);
    }
    Texture background, ballonRed, ballonGreen, ballonBlue;
    BitmapFont bitmapFont;

    @Override
    public void show() {
        globo = new Texture("ballon_blue.png");
        spriteBatch = new SpriteBatch();
        bitmapFont = new BitmapFont();
        spriteBatch = new SpriteBatch();
        background = new Texture("unnamed.jpg");
        ballonRed = new Texture("ballon_red.png");
        ballonGreen = new Texture("ballon_green.png");
        ballonBlue = new Texture("ballon_blue.png");
        xr = MathUtils.random( 0, 600);
        yr = MathUtils.random(-50, 2);
        xv = MathUtils.random( 0, 500);
        yv = MathUtils.random(-50, 2);
        xa = MathUtils.random( 0, 500);
        ya = MathUtils.random(-50, 2);

    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, 640, 480);
        bitmapFont.draw(spriteBatch,"Puntuacion: ",30,450);
        ArrayList<>
        spriteBatch.draw(ballonRed, xr, yr);
        spriteBatch.draw(ballonGreen, xv, yv);
        spriteBatch.draw(ballonBlue, xa, ya);
        spriteBatch.end();
        yr++;
        yv++;
        ya++;
    }
}
