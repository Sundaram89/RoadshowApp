package com.example.masmasfoodapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.MessageChatAdapter
import com.example.masmasfoodapp.model.MessageChatModel

class Message_chat : AppCompatActivity() {
   var messageChatModelList: List<MessageChatModel> =ArrayList()
    var recyclerView: RecyclerView? = null
    var adapter: MessageChatAdapter? = null
    var messageET: EditText? = null
    var sendBtn: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_chat)
        messageET = findViewById<View>(R.id.edit_message) as EditText
        sendBtn = findViewById<View>(R.id.send_message) as ImageView

        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        val manager = LinearLayoutManager(this@Message_chat, RecyclerView.VERTICAL, false)
        recyclerView!!.layoutManager = manager
        adapter = MessageChatAdapter(this, messageChatModelList as ArrayList<MessageChatModel>)
        recyclerView!!.setAdapter(adapter)
        sendBtn!!.setOnClickListener {
            val msg = messageET!!.text.toString()

            val model = MessageChatModel(
                msg, 2.toString())

            (messageChatModelList as ArrayList<MessageChatModel>).add(model)
            recyclerView!!.smoothScrollToPosition(messageChatModelList.size)
            adapter!!.notifyDataSetChanged()
            messageET!!.setText("")
        }

    }
}