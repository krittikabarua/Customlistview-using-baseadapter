package com.krittika.custom_listview_with_baseadapter;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private final Activity context;
    private final String[] district;
    private final Integer[] imageId;
    private final String[] description;
   private final String[] timedate;

    public CustomAdapter(Activity context, String[] district, Integer[] imageId,String[] description,String[] timedate) {
        this.context = context;
        this.district = district;
        this.imageId = imageId;
        this.description=description;
        this.timedate=timedate;
    }

    @Override
    public int getCount() {
        return district.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    /*    Myviewholder vh;

        if(convertView ==null){
            convertView =LayoutInflater.from(context).inflate(R.layout.mycustomlayout,parent,false);
            vh=new Myviewholder(convertView);
            convertView.setTag(vh);
        }

        else{
            vh=(Myviewholder) convertView.getTag();
        }*/
        LayoutInflater inflater =context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mycustomlayout,null,true);

        TextView txtTitle =rowView.findViewById(R.id.txt);
        ImageView imageView =rowView.findViewById(R.id.img);
        TextView txtTitle1 =rowView.findViewById(R.id.txt1);
        TextView txtTitle2=rowView.findViewById(R.id.txt2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii =new Intent(v.getContext(), Secondpage.class);


                String value = txtTitle.getText().toString().trim();
                ii.putExtra("key_name",value);



                String value1 = txtTitle1.getText().toString().trim();
                ii.putExtra("key_name1",value1);

                String value3 = txtTitle2.getText().toString().trim();
                ii.putExtra("key_name2",value3);

                ii.putExtra("imageId",imageId[position]);
              //  String value2 = imageView.getContentDescription().toString();
               // ii.putExtra("key_name2",value2);



                //int  imageId =ii.getExtras().getInt("imae");
                //imageView.setImageResource(imageId);


                v.getContext().startActivity(ii);

            }
        });

        txtTitle.setText(district[position]);
        txtTitle1.setText(description[position]);
        txtTitle2.setText(timedate[position]);
        imageView.setImageResource(imageId[position]);



        return rowView;

        /*
        vh.txTitle.setText(district[position]);
        vh.txtTitle1.setText(description[position]);
        vh.txtTitle2.setText(timedate[position]);
        vh.imageView.setImageResource(imageId[position]);


        return convertView;*/
    }

   /* private class Myviewholder{

        TextView txTitle,txtTitle1,txtTitle2;
        ImageView  imageView;


        public Myviewholder(View view){
             txTitle =view.findViewById(R.id.txt);
             imageView =view.findViewById(R.id.img);
             txtTitle1 =view.findViewById(R.id.txt1);
             txtTitle2=view.findViewById(R.id.txt2);
        }
    }*/

}
