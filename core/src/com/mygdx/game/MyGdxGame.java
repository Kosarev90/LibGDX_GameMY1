package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture imgBender;
	int clk;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		imgBender = new Texture("bender.jpg");
	}

	@Override
	public void render () {

		ScreenUtils.clear(0, 0, 0, 1);

		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) clk++;
		Gdx.graphics.setTitle("Clicked " + clk + " times!");

		float x = Gdx.input.getX() - imgBender.getWidth()/2;
		float y = Gdx.graphics.getHeight() - Gdx.input.getY() - imgBender.getHeight()/2;



		batch.begin();
		batch.draw(imgBender, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		imgBender.dispose();
	}
}
