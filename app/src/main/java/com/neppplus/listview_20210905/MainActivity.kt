package com.neppplus.listview_20210905

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20210905.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        임시방편 : 코드에 타이핑, 학생데이터 추가

        mStudentList.add( StudentData("조경진",1985,"서울시 동대문구") )
        mStudentList.add( StudentData("김기만",1972,"서울시 성북구") )
        mStudentList.add( StudentData("김민혁",2003,"경기도 이천시") )
        mStudentList.add( StudentData("김성은",1992,"서울시 중랑구") )
        mStudentList.add( StudentData("박광현",1990,"서울시 마포구") )
        mStudentList.add( StudentData("김민정",2006,"서울시 구로구") )
        mStudentList.add( StudentData("유순정",1992,"서울시 중랑구") )
        mStudentList.add( StudentData("이승엽",1993,"경기도 고양시") )
        mStudentList.add( StudentData("전상효",1992,"서울시 구로구") )
        mStudentList.add( StudentData("이진호",1991,"서울시 동대문구") )
        mStudentList.add( StudentData("김다은",1992,"서울시 동대문구") )
        mStudentList.add( StudentData("차수나",1966,"서울시 성북구") )

    }
}