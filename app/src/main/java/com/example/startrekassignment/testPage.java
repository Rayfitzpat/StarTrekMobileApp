package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import java.util.Locale;

public class testPage extends AppCompatActivity implements TextToSpeech.OnInitListener {

        private TextToSpeech mTTS;
        private EditText mEditText;
        private SeekBar mSeekBarPitch;
        private SeekBar mSeekBarSpeed;
        private Button mButtonSpeak;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mButtonSpeak = findViewById(R.id.button_speak);
            mTTS = new TextToSpeech(this, status -> {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.GERMAN);
                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            });
            mEditText = findViewById(R.id.edit_text);
            mSeekBarPitch = findViewById(R.id.seek_bar_pitch);
            mSeekBarSpeed = findViewById(R.id.seek_bar_speed);
            mButtonSpeak.setOnClickListener(v -> speak());
        }
        private void speak() {
            String text = mEditText.getText().toString();
            float pitch = (float) mSeekBarPitch.getProgress() / 50;
            if (pitch < 0.1) pitch = 0.1f;
            float speed = (float) mSeekBarSpeed.getProgress() / 50;
            if (speed < 0.1) speed = 0.1f;
            mTTS.setPitch(pitch);
            mTTS.setSpeechRate(speed);
            mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }
        @Override
        protected void onDestroy() {
            if (mTTS != null) {
                mTTS.stop();
                mTTS.shutdown();
            }
            super.onDestroy();
        }

    @Override
    public void onInit(int status) {

    }
}