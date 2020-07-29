package com.theOnlyHorst.oneironautics.items.book;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DreamDiaryPage extends PageContent {
    public static final transient int TITLE_HEIGHT = 28;

    public void addTitle(ArrayList<BookElement> list, String titleText, boolean dropShadow) {
        this.addTitle(list, titleText, dropShadow, 0);
    }

    public void addTitle(ArrayList<BookElement> list, String titleText, boolean dropShadow, int y) {
        TextData title = new TextData(titleText);
        title.scale = 1.2f;
        title.underlined = true;
        title.dropshadow = dropShadow;

        int w = (int) Math.ceil(this.parent.parent.parent.fontRenderer.getStringWidth(titleText) * title.scale);
        int x = (BookScreen.PAGE_WIDTH - w) / 2;

        list.add(new TextElement(x, y, w, 24, title));
    }
}
