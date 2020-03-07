package com.jdevio.quizio.model;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainSliderAdapter extends SliderAdapter {

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder viewHolder) {
        switch (position) {
            case 0:
                viewHolder.bindImageSlide("http://jdevio.com/Avd/b1.jpeg");
                break;
            case 1:
                viewHolder.bindImageSlide("http://jdevio.com/Avd/b2.jpg");
                break;
            case 2:
                viewHolder.bindImageSlide("http://jdevio.com/Avd/b3.jpg");
                break;
            case 3:
                viewHolder.bindImageSlide("http://jdevio.com/Avd/b4.png");
                break;
        }
    }
}