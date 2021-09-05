package com.neppplus.listview_20210905.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listview_20210905.R
import com.neppplus.listview_20210905.datas.StudentData
import org.w3c.dom.Text
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
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
//  tempRow는 절대 null일 가능성이 없다. 진짜 row로 옯기기
        val row = tempRow!!

//   row가 결과로 나가기 전에 내부에 있는 텍스트뷰들을 실제 데이터에 맞게 문구를 변경.
//  최종 가공 후에 결과로 나가자

// 포지션의 값 : 위치에 맞는 데이터가 누구의 데이터인지?
        val data = mList[position]
//      row 내부에서 필요한 텍스트뷰 등 UI요소들을 가져오자
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)

        nameTxt.text = data.name
        addressTxt.text = data.address
//      ageTxt는 출생년도가 아닌 나이가 들어가야함. 현재년도-입력값+1
        val age = Calendar.getInstance().get(Calendar.YEAR)-data.birthYear+1
        ageTxt.text = "(${age}세)"


        return row

    }
}