package ordersheet.order.ordersheet;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TwoFragment extends Fragment{

    Button btnSimpleSnackbar;
    LinearLayout.LayoutParams params,params2,params3,params4,params5,params6;
    public ArrayList<Bean_Menu> bean = new ArrayList<Bean_Menu>();
    Spinner.LayoutParams params1;
    LinearLayout l_row;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_two,container,false);
        btnSimpleSnackbar =(Button)rootView.findViewById(R.id.btnProceedtocheck);


        btnSimpleSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Successfully added in database...", Toast.LENGTH_SHORT).show();
                //final Dialog myDialog = new Dialog(getActivity());
                //myDialog.getWindow();
                //myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //myDialog.setCancelable(false);
                //myDialog.setContentView(R.layout.checkout_conform);

                //myDialog.setCancelable(true);
                //myDialog.show();


            }
        });


        l_row = (LinearLayout)rootView.findViewById(R.id.lout);

        params4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
        params2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,40);
        params5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params1 = new LinearLayout.LayoutParams(200, 100);
        params6 = new LinearLayout.LayoutParams(30, 35);

        bean = new ArrayList<Bean_Menu>();


        //bean.add(new Bean_Menu("" + R.drawable.images, "Dark Gray site",
         //       "Size M", "200"));
        //bean.add(new Bean_Menu("" + R.drawable.images, "Casual Shirt",
         //       "Size M", "90"));

        bean.add(new Bean_Menu(""+R.drawable.images, "Cosmic Havy Door (7*2.5)",
               "015.101.005", "5077"));

        //bean.add(new Bean_Menu("015.101.005" + R.drawable.jigo1, "Cosmic Havy Door (7*2.5)",
        //        "Pipe Door", "5077"));

        bean.add(new Bean_Menu(""+R.drawable.cosmic6, "Cosmick Wooden Door (7*2.5)",
                "015.101.048", "3550"));
        bean.add(new Bean_Menu(""+R.drawable.solid, "Solid glass rising sum (7*2.5)",
                "015.101.151", "4260"));
        bean.add(new Bean_Menu(""+R.drawable.carddoor, "Solid card door (2.5*2.5)",
                "015.101.014", "1426"));
        bean.add(new Bean_Menu(""+R.drawable.coddoor, "Solid cod door (2.5*2.5)",
                "015.101.015", "1426"));


        addservices();

        return rootView;
    }

    private void addservices() {


        for (int ij = 0; ij < bean.size(); ij++) {

            LinearLayout lmain = new LinearLayout(getActivity());
            lmain.setLayoutParams(params);
            lmain.setOrientation(LinearLayout.HORIZONTAL);
            lmain.setPadding(20, 20, 20, 20);

            LinearLayout.LayoutParams par1 = new LinearLayout.LayoutParams(300,
                    200, 2.0f);
            LinearLayout.LayoutParams par2 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 3.0f);
            LinearLayout.LayoutParams par3 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 2.0f);

            LinearLayout l1 = new LinearLayout(getActivity());
            l1.setLayoutParams(par1);
            l1.setPadding(10, 10, 10, 10);
            l1.setOrientation(LinearLayout.HORIZONTAL);
            l1.setGravity(Gravity.LEFT | Gravity.CENTER);

            LinearLayout l2 = new LinearLayout(getActivity());
            l2.setLayoutParams(par2);
            l2.setOrientation(LinearLayout.VERTICAL);
            l2.setPadding(20, 2, 0, 2);
            l2.setGravity(Gravity.RIGHT | Gravity.CENTER);

            LinearLayout l3 = new LinearLayout(getActivity());
            l3.setLayoutParams(par2);
            l3.setOrientation(LinearLayout.VERTICAL);
            l3.setGravity(Gravity.LEFT | Gravity.CENTER);

            LinearLayout l4 = new LinearLayout(getActivity());
            l4.setLayoutParams(par2);
            l4.setOrientation(LinearLayout.HORIZONTAL);
            l4.setGravity(Gravity.RIGHT | Gravity.CENTER);

            LinearLayout l5 = new LinearLayout(getActivity());
            l5.setLayoutParams(par2);
            l5.setOrientation(LinearLayout.VERTICAL);
            l5.setGravity(Gravity.LEFT | Gravity.CENTER);

            final LinearLayout l6 = new LinearLayout(getActivity());
            l6.setLayoutParams(par2);
            l6.setOrientation(LinearLayout.VERTICAL);
            l6.setGravity(Gravity.LEFT | Gravity.CENTER);

            final LinearLayout l7 = new LinearLayout(getActivity());
            //l7 = new LinearLayout(Product_Detail.this);
            l7.setLayoutParams(par2);
            l7.setPadding(0, 0, 25, 0);
            l7.setTag("" + ij);
            l7.setOrientation(LinearLayout.HORIZONTAL);
            l7.setGravity(Gravity.RIGHT | Gravity.CENTER);

            l7.setId(ij);

            final ImageView image = new ImageView(getActivity());
            image.setBackgroundResource(R.drawable.image_selector);
            image.setPadding(10, 10, 10, 10);
            image.setImageResource(Integer.parseInt(bean.get(ij).getIcon()));
            image.setTag(bean.get(ij).getIcon());
            l1.addView(image);


            final TextView txt_name = new TextView(getActivity());
            txt_name.setTextColor(Color.parseColor("#555555"));
            txt_name.setMaxLines(1);
            txt_name.setGravity(Gravity.LEFT);
            txt_name.setTextSize(14);
            txt_name.setPadding(5, 15, 10, 0);
            txt_name.setEllipsize(TextUtils.TruncateAt.END);
            txt_name.setText(bean.get(ij).getName());
            txt_name.setTag(ij);
            l3.addView(txt_name);

          /*  final TextView txt_name11 = new TextView(getActivity()());
            txt_name11.setTextColor(Color.parseColor("#000000"));
            txt_name11.setMaxLines(1);
            txt_name11.setGravity(Gravity.LEFT);
            txt_name11.setTag(bean.get(ij).getPrice());
            l3.addView(txt_name11);*/


            final TextView txt_name1 = new TextView(getActivity());
            txt_name1.setTextColor(Color.parseColor("#989898"));
            txt_name1.setMaxLines(1);
            txt_name1.setGravity(Gravity.LEFT);
            txt_name1.setTextSize(12);
            txt_name1.setPadding(5, 0, 2, 10);
            txt_name1.setEllipsize(TextUtils.TruncateAt.END);
            txt_name1.setText(bean.get(ij).getProname());
            txt_name1.setTag(bean.get(ij).getProname());
            l3.addView(txt_name1);

           /* final TextView txt_prokg = new TextView(getActivity()());
            txt_prokg.setTextColor(Color.parseColor("#000000"));
            txt_prokg.setMaxLines(1);
            txt_prokg.setLayoutParams(params1);
            txt_prokg.setGravity(Gravity.LEFT);
            txt_prokg.setTextSize(14);
            txt_prokg.setPadding(25, 6, 5, 6);
*/
          /* txt_prokg.setBackgroundResource(R.drawable.spborder);
            txt_prokg.setCompoundDrawablesWithIntrinsicBounds(0, 0,
                   R.drawable.down_arrow, 0);*/
           /* txt_prokg.setEllipsize(TextUtils.TruncateAt.END);
            txt_prokg.setText("1 KG");
            txt_prokg.setTag("1");
            l3.addView(txt_prokg);*/
            l2.addView(l3);


            final TextView txt_proprice = new TextView(getActivity());
            txt_proprice.setTextColor(Color.parseColor("#555555"));
            txt_proprice.setMaxLines(1);
            txt_proprice.setGravity(Gravity.LEFT);
            txt_proprice.setTextSize(12);
            txt_proprice.setPadding(5, 5, 10, 0);
            txt_proprice.setEllipsize(TextUtils.TruncateAt.END);
            txt_proprice.setText("$ " + bean.get(ij).getPrice());
            txt_proprice.setTag(bean.get(ij).getPrice());
            l5.addView(txt_proprice);
            l4.addView(l5);

          /*  final ImageView image1 = new ImageView(getActivity()());
            image1.setImageResource(R.drawable.add_button);
            image1.setTag("" + ij);
            image1.setPadding(5, 20, 10, 0);
            l6.addView(image1);
            l4.addView(l6);*/


            int qty = 0;

            final TextView txt_proquent = new TextView(getActivity());
            txt_proquent.setTextColor(Color.parseColor("#000000"));
            txt_proquent.setMaxLines(1);
            txt_proquent.setGravity(Gravity.LEFT);
            txt_proquent.setTextSize(14);
            txt_proquent.setPadding(25, 0, 25, 0);
            txt_proquent.setEllipsize(TextUtils.TruncateAt.END);
            txt_proquent.setText("0");


            final ImageView image2 = new ImageView(getActivity());
            image2.setBackgroundResource(R.drawable.ic_left);
            image2.setLayoutParams(params6);


            final ImageView image4 = new ImageView(getActivity());
            image4.setBackgroundResource(R.drawable.ic_plu);
            image4.setLayoutParams(params6);




            l7.addView(image2);
            l7.addView(txt_proquent);
            l7.addView(image4);



            l4.addView(l7);
            l2.addView(l4);


            lmain.addView(l1);
            lmain.addView(l2);


            final View txt_name2 = new View(getActivity());
            txt_name2.setLayoutParams(params4);
            txt_name2.setPadding(10, 10, 10, 10);

            txt_name2.setBackgroundColor(Color.parseColor("#999999"));

            l_row.addView(lmain);
            l_row.addView(txt_name2);

            final int finalIj = ij;

            image2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    int i = Integer.parseInt(txt_proquent.getText().toString());
                    i = i - 1;

                    if (i <= 0) {
                        txt_proquent.setText("0");
                        i=0;
                    }
                    else {
                        txt_proquent.setText(i + "");
                        //txt_proprice.setText(Integer.parseInt(bean.get(finalIj).getPrice()));
                        //txt_proprice.setText(i+"");
                        int price = i * Integer.parseInt(bean.get(finalIj).getPrice());
                        txt_proprice.setText(price+"");
                    }
                }

            });

            image4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    int i = Integer.parseInt(txt_proquent.getText().toString());
                    i = i + 1;
                    txt_proquent.setText(i + "");
                    int price = i * Integer.parseInt(bean.get(finalIj).getPrice());
                    txt_proprice.setText(price+"");
                }

            });





        }

    }

}
