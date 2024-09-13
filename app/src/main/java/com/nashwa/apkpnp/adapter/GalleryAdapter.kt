import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.apkpnp.MainActivity
import com.nashwa.apkpnp.Model.ImageModel
import com.nashwa.apkpnp.R

class GalleryAdapter(private val images: List<ImageModel>) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {

    class GalleryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        // Jika ada deskripsi/judul
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_galery, parent, false)
        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val currentImage = images[position]
        holder.imageView.setImageResource(currentImage.imageResId)  // Set gambar
                      // Set judul (jika ada)

        // Tambahkan OnClickListener untuk item gambar
        holder.imageView.setOnClickListener {
            // Kembali ke halaman sebelumnya saat gambar diklik
            val activity = it.context as Activity
            activity.finish()  // Mengakhiri Activity dan kembali ke halaman sebelumnya
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}
