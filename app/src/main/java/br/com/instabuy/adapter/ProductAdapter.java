package br.com.instabuy.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import java.text.NumberFormat;
import java.util.List;
import br.com.instabuy.R;
import br.com.instabuy.model.Product;

/**
 * Created by brunolemgruber on 15/07/16.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.StoreViewHolder> {

    protected static final String TAG = "instabuy";
    public static final String AMAZON_URL = "https://s3-us-west-2.amazonaws.com/";
    private final List<Product> products;
    private final Context context;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }

    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item_product, viewGroup, false);
        StoreViewHolder holder = new StoreViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final StoreViewHolder holder, final int position) {

        Product p = products.get(position);

        holder.name.setText(p.getName());
        holder.brand.setText(p.getBrand());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        holder.price.setText(formatter.format(p.getPc().get(0).getValidPrice()));

        RequestOptions myOptions = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL);
        Glide.with(context).load(AMAZON_URL + "ib.image.medium/m-" + p.getThumb()).apply(myOptions).listener(new RequestListener<Drawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object o, Target<Drawable> target, boolean b) {
                return false;
            }

            @Override
            public boolean onResourceReady(Drawable drawable, Object o, Target<Drawable> target, DataSource dataSource, boolean b) {
                return false;
            }
        }).into(holder.img);

    }

    public static class StoreViewHolder extends RecyclerView.ViewHolder {

        public TextView name,brand,price;
        public ImageView img;

        public StoreViewHolder(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.name);
            brand = (TextView) view.findViewById(R.id.brand);
            price = (TextView) view.findViewById(R.id.price);
            img = (ImageView) view.findViewById(R.id.img);

        }
    }

}
