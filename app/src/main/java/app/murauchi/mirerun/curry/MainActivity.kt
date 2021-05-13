package app.murauchi.mirerun.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val people = arrayOf<String>("COOKY","CHIMMY","KOYA","TATA")
    val food = arrayOf<String>("クッキー","キャンディー","マカロン","チョコ","フラペチーノ","メレンゲ")
    val select = arrayOf<String>("あげれました^^", "あげれませんでした")
    val textsize = arrayOf(12F, 30F)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        serveFood.setOnClickListener {
            val index = Random().nextInt(4) //0~3までの乱数を作成,4は乱数の数=4個
            val name = people[index] //index番号目の配列要素をnameに代入
            nameTextView.text = name + "に" //nameをnameTextViewに表示

            foodTextView.text = food[Random().nextInt(6)] + "を"

            val index2 = Random().nextInt(2)
            verbTextView.text = select[index2]
            verbTextView.textSize = textsize[index2]

            //if(Random().nextInt(100) < 50){
                //verbTextView.text = "あげました^^"
            //}else{
                //verbTextView.text = "あげれませんでした"
            //}
        }
    }

}