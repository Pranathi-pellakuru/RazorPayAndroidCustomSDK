package com.pranathicodes.razorpay

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.razorpay.PaymentMethodsCallback
import com.razorpay.PaymentResultListener
import com.razorpay.Razorpay
import org.json.JSONObject

class PaymentActivity : ComponentActivity(), PaymentResultListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val amount = intent.getStringExtra("amount")
        val orderId = intent.getStringExtra("orderId")
        val razorpay = Razorpay(this,Constants.RAZORPAY_KEY)
        razorpay.getPaymentMethods(object : PaymentMethodsCallback{
            override fun onPaymentMethodsReceived(p0: String?) {
                Log.d("Result", "" + p0)
            }

            override fun onError(p0: String?) {
                Log.d("error", "" + p0)
            }

        })
        if (amount != null) {
            val options = JSONObject()
            options.put("name","Pranathi Corp")
            //You can omit the image option to fetch the image from the dashboard
            options.put("currency","INR")
            options.put("order_id", orderId)
            options.put("amount",(amount.toInt() * 100).toString())//pass amount in currency subunits
        }
    }

    override fun onPaymentSuccess(p0: String?) {
        Toast.makeText(this, "payment success", Toast.LENGTH_SHORT).show()
        this.finish()
    }

    override fun onPaymentError(p0: Int, p1: String?) {
        Toast.makeText(this, "payment failed", Toast.LENGTH_SHORT).show()
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
