package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class PantallaInicial extends BaseScreen {
    private Stage stage;
    SpriteBatch spriteBatch;
    Texture globo;
    public PantallaInicial(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        globo = new Texture("ballon_blue.png");
        spriteBatch = new SpriteBatch();
        BaseButton buttonStart = new BaseButton("button_start_up.png", "button_start_over.png", 228, 226, 420, 100, new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                setScreen(new Pantalla2(game));
                return true;
            }
        });

        Gdx.input.setInputProcessor(stage = new Stage());
        stage.addActor(buttonStart);
    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
    }
}
