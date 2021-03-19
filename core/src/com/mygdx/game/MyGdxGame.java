package com.mygdx.game;

import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {
	@Override public void create() {setScreen(new Pantalla2(this));}
	@Override public void render () { super.render(); }
}

