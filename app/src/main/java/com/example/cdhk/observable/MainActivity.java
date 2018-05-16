package com.example.cdhk.observable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;


public class MainActivity extends AppCompatActivity {

    /**
     * 观察者
     */
    final Observer<String> observer = new Observer<String>() {


        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };

    Subscriber<String> subscriber = new Subscriber<String>() {

        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(){
        Toast.makeText(this,"",Toast.LENGTH_LONG).show();
        /**
         * 被观察者
         */
        Observable observable=Observable.create(new Observable.OnSubscribe<String>() {
    @Override
    public void call(Subscriber<? super String> subscriber) {
        subscriber.onNext("Hello");
        subscriber.onNext("Hi");
        subscriber.onNext("Aloha");
        subscriber.onCompleted();
        /*
        队列
         */
        //   bservable observable = Observable.just("Hello", "Hi", "Aloha");
// 将会依次调用：
// onNext("Hello");
// onNext("Hi");
// onNext("Aloha");
// onCompleted();

        /*
        数组
         */
//        String[] words = {"Hello", "Hi", "Aloha"};
//        Observable observable = Observable.from(words);
// 将会依次调用：
// onNext("Hello");
// onNext("Hi");
// onNext("Aloha");
// onCompleted();
 //       observable.subscribe(observer);
    }
});


    }

}
