package nuttapon.dots.co.th.dotssolutions;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class MyAlert {

    private Context context; /// การเชื่อมต่อ

    public MyAlert(Context context) {
        this.context = context;
    }
   public void normalDialog(String titleString, String messageString){

       AlertDialog.Builder builder =new AlertDialog.Builder(context);
        builder.setCancelable(false);// ทำให้ปุ่ม Undo ใช้งานไม่ได้ชั่วคราว
       builder.setIcon(R.drawable.ic_action_alert);   // ดึงกระดิงออกมาโชว์
       builder.setTitle(titleString);
       builder.setMessage(messageString);
       builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
           }
       });
   builder.show();

    }



}
