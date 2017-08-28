package tecsup.rberrospi.com.teoria02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void ScrollViewHorizontalActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ScrollViewHorizontalActivity.class);
        startActivity(intent);
    }

    public void AndroidButtonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), AndroidButtonActivity.class);
        startActivity(intent);
    }

    public void ImageButtonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ImageButtonActivity.class);
        startActivity(intent);
    }

    public void EditTextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), EditTextActivity.class);
        startActivity(intent);
    }

    public void CheckBoxActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), CheckBoxActivity.class);
        startActivity(intent);
    }

    public void RadioButtontActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), RadioButtontActivity.class);
        startActivity(intent);
    }

    public void SwitchButtonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SwitchButtonActivity.class);
        startActivity(intent);
    }

    public void ToggleButtonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ToggleButtonActivity.class);
        startActivity(intent);
    }

    public void RatingBarActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), RatingBarActivity.class);
        startActivity(intent);
    }

    public void SpinnerActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
        startActivity(intent);
    }

    public void ProgressBarActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ProgressBarActivity.class);
        startActivity(intent);
    }

    public void DatePickerActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), DatePickerActivity.class);
        startActivity(intent);
    }

    public void TimePickerActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), TimePickerActivity.class);
        startActivity(intent);
    }

    public void FloatingActionButtonActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), FloatingActionButtonActivity.class);
        startActivity(intent);
    }

    public void FloatingLabelsActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), FloatingLabelsActivity.class);
        startActivity(intent);
    }

    public void SeekBarActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SeekBarActivity.class);
        startActivity(intent);
    }

    public void SimpleDialogActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SimpleDialogActivity.class);
        startActivity(intent);
    }

    public void CustomAlertDialogActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), CustomAlertDialogActivity.class);
        startActivity(intent);
    }

    public void SnackbarActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SnackbarActivity.class);
        startActivity(intent);
    }

    public void NotificationActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), NotificationActivity.class);
        startActivity(intent);
    }
    public void ImageViewActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), ImageViewActivity.class);
        startActivity(intent);
    }

    public void VideoViewActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), VideoViewActivity.class);
        startActivity(intent);
    }

    public void WebViewActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
        startActivity(intent);
    }

    public void SearchViewActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SearchViewActivity.class);
        startActivity(intent);
    }

    public void CalendarViewActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), CalendarViewActivity.class);
        startActivity(intent);
    }


}
