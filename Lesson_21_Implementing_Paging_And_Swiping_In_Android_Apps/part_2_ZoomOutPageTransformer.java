public class ZoomOutPageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        int pageHeight = view.getHeight();

        if (position < -1) { // [-Infinity,-1)
            view.setAlpha(0);
        } else if (position <= 1) { // [-1,1]
            float scaleFactor = Math.max(0.85f, 1 - Math.abs(position));
            float vertMargin = pageHeight * (1 - scaleFactor) / 2;
            float horzMargin = pageWidth * (1 - scaleFactor) / 2;

            if (position < 0) {
                view.setTranslationX(horzMargin - vertMargin / 2);
            } else {
                view.setTranslationX(-horzMargin + vertMargin / 2);
            }

            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);
            view.setAlpha(1 - Math.abs(position));
        } else { // (1,+Infinity]
            view.setAlpha(0);
        }
    }
}
viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
