package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import cn.edu.gdmec.android.mobileguard.R;
import cn.edu.gdmec.android.mobileguard.m2theftguard.adapter.ContactAdapter;
import cn.edu.gdmec.android.mobileguard.m2theftguard.entity.ContactInfo;

/**
 * Created by Administrator on 2017/10/22.
 */

public class ContactSelectActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView mListView;
    private ContactAdapter adapter;
    private List<ContactInfo> systemContacts;
    Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg){
            switch (msg.what){
                case 10:
                    if (systemContacts !=null){
                        adapter = new ContactAdapter(systemContacts,ContactSelectActivity.this);
                        mListView.setAdapter(adapter);
                    }
                    break;
            }
        };
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_select);
        initView();
    }
    private void initView(){
        ((TextView)findViewById(R.id.tv_title)).setText("选择联系人");
        ImageView mLeftImgv = (ImageView)findViewById(R.id.imgv_leftbtn);
        mLeftImgv.setOnClickListener(this);
        mLeftImgv.setImageResource(R.drawable.back);
        findViewById(R.id.rl_titlebar).setBackgroundColor(getResources().getColor(R.color.purple));
        mListView = (ListView) findViewById(R.id.lv_contact);
    }
    @Override
    public void onClick(View view) {

    }
}
