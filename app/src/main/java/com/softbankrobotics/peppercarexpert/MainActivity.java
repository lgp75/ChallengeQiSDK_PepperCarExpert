package com.softbankrobotics.peppercarexpert;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.QiSDK;
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks;
import com.aldebaran.qi.sdk.builder.ChatBuilder;
import com.aldebaran.qi.sdk.builder.QiChatbotBuilder;
import com.aldebaran.qi.sdk.builder.TopicBuilder;
import com.aldebaran.qi.sdk.design.activity.RobotActivity;
import com.aldebaran.qi.sdk.object.conversation.BaseQiChatExecutor;
import com.aldebaran.qi.sdk.object.conversation.Chat;
import com.aldebaran.qi.sdk.object.conversation.QiChatExecutor;
import com.aldebaran.qi.sdk.object.conversation.QiChatbot;
import com.aldebaran.qi.sdk.object.conversation.Topic;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends RobotActivity implements RobotLifecycleCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onRobotFocusGained(QiContext qiContext) {

        /////////////////////////////////////////////////
        //////////////////  HANDS ON 2 //////////////////
        // Assets :
        //      topic: cars.top
        //
        // Step by step:
        //      1/ create a topic
        //      2/ create a chat
        //      3/ create the showCar executor
        //
        // .....
    }

    @Override
    public void onRobotFocusLost() {

    }

    @Override
    public void onRobotFocusRefused(String reason) {

    }

    // ....
    //
    // 4/ create your executor class
    //      case 1. will display a default image
    //      case 2. will display a specific car color image
    //      case 3. could display an old or new car color image
    //
    ///////////////////////////////////////////////////////////
}
