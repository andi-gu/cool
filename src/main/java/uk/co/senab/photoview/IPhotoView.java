
package uk.co.senab.photoview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;


public interface IPhotoView {

  public static final float DEFAULT_MAX_SCALE = 3.0f; //设置能放大到最大的倍数
    public static final float DEFAULT_MID_SCALE = 2.7f; //设置中等程度的缩放比例
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    public static final int DEFAULT_ZOOM_DURATION = 200; //设置动画时间


    boolean canZoom();


    RectF getDisplayRect();


    boolean setDisplayMatrix(Matrix finalMatrix);


    Matrix getDisplayMatrix();


    @Deprecated
    float getMinScale();


    float getMinimumScale();


    @Deprecated
    float getMidScale();


    float getMediumScale();


    @Deprecated
    float getMaxScale();


    float getMaximumScale();

    float getScale();


    ImageView.ScaleType getScaleType();


    void setAllowParentInterceptOnEdge(boolean allow);


    @Deprecated
    void setMinScale(float minScale);


    void setMinimumScale(float minimumScale);


    @Deprecated
    void setMidScale(float midScale);


    void setMediumScale(float mediumScale);


    @Deprecated
    void setMaxScale(float maxScale);


    void setMaximumScale(float maximumScale);


    void setOnLongClickListener(View.OnLongClickListener listener);


    void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener listener);


    void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener listener);

   
    PhotoViewAttacher.OnPhotoTapListener getOnPhotoTapListener();

  
    void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener listener);

    
    void setRotationTo(float rotationDegree);

    
    void setRotationBy(float rotationDegree);

    
    PhotoViewAttacher.OnViewTapListener getOnViewTapListener();

   
    void setScale(float scale);

    void setScale(float scale, boolean animate);

   
    void setScale(float scale, float focalX, float focalY, boolean animate);

   
    void setScaleType(ImageView.ScaleType scaleType);

   
    void setZoomable(boolean zoomable);

   
    void setPhotoViewRotation(float rotationDegree);

  
    Bitmap getVisibleRectangleBitmap();

   
    void setZoomTransitionDuration(int milliseconds);

  
    IPhotoView getIPhotoViewImplementation();

    
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener newOnDoubleTapListener);
}
