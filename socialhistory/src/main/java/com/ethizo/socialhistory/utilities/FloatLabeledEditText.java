package com.ethizo.socialhistory.utilities;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ethizo.socialhistory.R;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.animation.AnimatorProxy;


public class FloatLabeledEditText extends FrameLayout {

    private static final int DEFAULT_PADDING_LEFT = 2;
    private static final String ALPHA = "alpha";

    private TextView mHintTextView/*, mInputTextView*/;
    private EditText mEditText;
    private MaterialSpinner mMaterialSpinner;

    private final Context mContext;

    public FloatLabeledEditText(Context context) {
        super(context);
        mContext = context;
    }

    public FloatLabeledEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setAttributes(attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public FloatLabeledEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
        setAttributes(attrs);
    }

    private void setAttributes(AttributeSet attrs) {
        mHintTextView = new TextView(mContext);

        final TypedArray a = mContext.obtainStyledAttributes(attrs, R.styleable.FloatLabeledEditText);
        final int padding = a.getDimensionPixelSize(R.styleable.FloatLabeledEditText_fletPadding, 0);
        final int defaultPadding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, DEFAULT_PADDING_LEFT, getResources().getDisplayMetrics());
        final int paddingLeft = a.getDimensionPixelSize(R.styleable.FloatLabeledEditText_fletPaddingLeft, defaultPadding);
        final int paddingTop = a.getDimensionPixelSize(R.styleable.FloatLabeledEditText_fletPaddingTop, 0);
        final int paddingRight = a.getDimensionPixelSize(R.styleable.FloatLabeledEditText_fletPaddingRight, 0);
        final int paddingBottom = a.getDimensionPixelSize(R.styleable.FloatLabeledEditText_fletPaddingBottom, 0);
        Drawable background = a.getDrawable(R.styleable.FloatLabeledEditText_fletBackground);

        if (padding != 0) {
            mHintTextView.setPadding(padding, padding, padding, padding);
        } else {
            mHintTextView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }

        if (background != null) {
            setHintBackground(background);
        }
        mHintTextView.setTextAppearance(mContext, a.getResourceId(R.styleable.FloatLabeledEditText_fletTextAppearance, android.R.style.TextAppearance_Small));

        //Start hidden
        mHintTextView.setVisibility(INVISIBLE);
        AnimatorProxy.wrap(mHintTextView).setAlpha(0);

        addView(mHintTextView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        a.recycle();
    }

    @SuppressLint("NewApi")
    private void setHintBackground(Drawable background) {
        mHintTextView.setBackground(background);
    }

    @Override
    public final void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            if (mEditText != null) {
                throw new IllegalArgumentException("Can only have one Edittext subview");
            }
            final LayoutParams lp = new LayoutParams(params);
            lp.gravity = Gravity.BOTTOM;
            lp.topMargin = (int) (mHintTextView.getTextSize() + mHintTextView.getPaddingBottom() + mHintTextView.getPaddingTop());
            params = lp;

            setEditText((EditText) child);
        }
        if (child instanceof MaterialSpinner) {
            if (mMaterialSpinner != null) {
                throw new IllegalArgumentException("Can only have one Edittext subview");
            }

            final LayoutParams lp = new LayoutParams(params);
            lp.gravity = Gravity.BOTTOM;
            lp.topMargin = (int) (mHintTextView.getTextSize() + mHintTextView.getPaddingBottom() + mHintTextView.getPaddingTop());
            params = lp;

            setSpinner((MaterialSpinner) child);
        } /*else if (child instanceof TextView) {
         *//*if (mInputTextView != null) {
                throw new IllegalArgumentException("Can only have one Edittext subview");
            }*//*
            final LayoutParams lp = new LayoutParams(params);
            lp.gravity = Gravity.BOTTOM;
            lp.topMargin = (int) (mHintTextView.getTextSize() + mHintTextView.getPaddingBottom() + mHintTextView.getPaddingTop());
            params = lp;
            setInputTextView((TextView) child);
        }*/
        super.addView(child, index, params);
    }

    /**
     * @param editText
     */
    private void setEditText(EditText editText) {
        mEditText = editText;

        mEditText.addTextChangedListener(new InputTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                setShowHint(!TextUtils.isEmpty(s)); // called for editText
            }
        });

        mEditText.setOnFocusChangeListener((view, gotFocus) -> onFocusChanged(gotFocus));

        mHintTextView.setText(mEditText.getHint());

        if (!TextUtils.isEmpty(mEditText.getText())) {
            mHintTextView.setVisibility(VISIBLE);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private void setSpinner(MaterialSpinner materialSpinner) {
        mMaterialSpinner = materialSpinner;
        mMaterialSpinner.setOnFocusChangeListener(null);
        mMaterialSpinner.setOnTouchListener(null);

        mEditText = mMaterialSpinner;
        mEditText.addTextChangedListener(new InputTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                setShowHint(!TextUtils.isEmpty(s)); // called for material spinner
            }
        });

        mEditText.setOnFocusChangeListener((view, gotFocus) -> onFocusChanged(gotFocus));

        mHintTextView.setText(mEditText.getHint());

        if (!TextUtils.isEmpty(mEditText.getText())) {
            mHintTextView.setVisibility(VISIBLE);
        }
    }

   /* @SuppressLint("ClickableViewAccessibility")
    private void setInputTextView(TextView textView) {
        mInputTextView = textView;
        mInputTextView.setOnFocusChangeListener(null);
        mInputTextView.setOnTouchListener(null);
        mInputTextView.addTextChangedListener(new InputTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                setShowHint(!TextUtils.isEmpty(s));// called for text view
            }
        });

        mInputTextView.setOnFocusChangeListener((view, gotFocus) -> onFocusChanged(gotFocus));

        mHintTextView.setText(mInputTextView.getHint());

        if (!TextUtils.isEmpty(mInputTextView.getText())) {
            mHintTextView.setVisibility(VISIBLE);
        }
    }*/

    /**
     * @param gotFocus
     */
    private void onFocusChanged(boolean gotFocus) {
        if (gotFocus && mHintTextView.getVisibility() == VISIBLE) {
            ObjectAnimator.ofFloat(mHintTextView, ALPHA, 0.83f, 1f).start();
        } else if (mHintTextView.getVisibility() == VISIBLE) {
            AnimatorProxy.wrap(mHintTextView).setAlpha(1f);  //Need this for compat reasons
            ObjectAnimator.ofFloat(mHintTextView, ALPHA, 1f, 0.83f).start();
        }
    }

    private void setShowHint(final boolean show) {
        AnimatorSet animation = null;
        if ((mHintTextView.getVisibility() == VISIBLE) && !show) {
            animation = new AnimatorSet();
            ObjectAnimator move = ObjectAnimator.ofFloat(mHintTextView, "translationY", 0, mHintTextView.getHeight() / 8f);
            ObjectAnimator fade = ObjectAnimator.ofFloat(mHintTextView, ALPHA, 1, 0);
            animation.playTogether(move, fade);
        } else if ((mHintTextView.getVisibility() != VISIBLE) && show) {
            animation = new AnimatorSet();
            ObjectAnimator move = ObjectAnimator.ofFloat(mHintTextView, "translationY", mHintTextView.getHeight() / 8f, 0);
            ObjectAnimator fade;
            if (mEditText != null && mEditText.isFocused()) {
                fade = ObjectAnimator.ofFloat(mHintTextView, ALPHA, 0, 1);
            } else {
                fade = ObjectAnimator.ofFloat(mHintTextView, ALPHA, 0, 0.83f);
            }
            animation.playTogether(move, fade);
        }

        if (animation != null) {
            animation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animation) {
                    super.onAnimationStart(animation);
                    mHintTextView.setVisibility(VISIBLE);
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    mHintTextView.setVisibility(show ? VISIBLE : INVISIBLE);
                    AnimatorProxy.wrap(mHintTextView).setAlpha(show ? 1 : 0);
                }
            });
            animation.start();
        }
    }

    public EditText getEditText() {
        return mEditText;
    }

    public MaterialSpinner getSpinner() {
        return mMaterialSpinner;
    }

    public void setHint(Spanned hint) {
        if (mEditText != null) {
            mEditText.setHint(hint);
        }
        mHintTextView.setText(hint);
    }

    public CharSequence getHint() {
        return mHintTextView.getHint();
    }
}
