package com.example.studyapp

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_row.view.*

class RecyclerViewRow (private val appContext: Context, private val cards: ArrayList<Cards>): RecyclerView.Adapter<RecyclerViewRow.ItemViewHolder>() {
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.rv_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val cardTitle = cards[position].cardTitle
        val cardDetails = cards[position].cardDetails

        holder.itemView.apply {
            title.text = cardTitle
            details.text = cardDetails
            cardView.setOnClickListener { showAlertDialog(cards[position].cardTitle, cards[position].cardDetails) }
        }
    }

    override fun getItemCount() = cards.size

    private fun showAlertDialog(title: String, details: String) {
        val dialogBuilder = androidx.appcompat.app.AlertDialog.Builder(appContext)

        dialogBuilder.setMessage(details)

            .setCancelable(false)
            .setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, id ->
                dialog.dismiss()
            })

        val alert = dialogBuilder.create()
        alert.setTitle(title)
        alert.show()
    }
}