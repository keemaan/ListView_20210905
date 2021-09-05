package com.neppplus.listview_20210905.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.listview_20210905.R
import com.neppplus.listview_20210905.datas.StudentData

class StudentAdapter(
    val mContext: Context
    val resId: Int
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext,resId,mList) {

//    한 줄에 해당하는 xml과 + StudentData클래서의 정보를 결합 -> 리스트뷰의 각 자리에 배치
//        xml에 그려둔 한 줄 모양을 => kt안에서 활용할 수 있어야 함
//      활용을 도와주는 도구도 필요

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item,null)
        }

    }
}