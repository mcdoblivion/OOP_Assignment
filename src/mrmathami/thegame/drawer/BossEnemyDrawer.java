package mrmathami.thegame.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import mrmathami.thegame.entity.GameEntity;
import mrmathami.thegame.entity.enemy.BossEnemy;

import javax.annotation.Nonnull;

public final class BossEnemyDrawer implements EntityDrawer {
	@Override
	public void draw(long tickCount, @Nonnull GraphicsContext graphicsContext, @Nonnull GameEntity entity, double screenPosX, double screenPosY, double screenWidth, double screenHeight, double zoom) {
		graphicsContext.setFill(Color.DARKVIOLET);
		graphicsContext.setFont(Font.font(15));
		graphicsContext.fillText(String.format(" %d", ((BossEnemy) entity).getHealth()), screenPosX, screenPosY);
		graphicsContext.fillRoundRect(screenPosX, screenPosY, screenWidth, screenHeight, 4, 4);
	}
}
