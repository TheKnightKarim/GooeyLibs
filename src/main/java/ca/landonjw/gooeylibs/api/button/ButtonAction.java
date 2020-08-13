package ca.landonjw.gooeylibs.api.button;

import ca.landonjw.gooeylibs.api.page.IPage;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.ClickType;

import javax.annotation.Nonnull;

public class ButtonAction {

	private EntityPlayerMP player;
	private ClickType clickType;
	private IButton button;
	private IPage page;

	public ButtonAction(@Nonnull EntityPlayerMP player,
	                    @Nonnull ClickType clickType,
	                    @Nonnull IButton button,
	                    @Nonnull IPage page) {
		this.player = player;
		this.clickType = clickType;
		this.button = button;
		this.page = page;
	}

	public EntityPlayerMP getPlayer() {
		return player;
	}

	public ClickType getClickType() {
		return clickType;
	}

	public IButton getButton() {
		return button;
	}

	public IPage getPage() {
		return page;
	}

}