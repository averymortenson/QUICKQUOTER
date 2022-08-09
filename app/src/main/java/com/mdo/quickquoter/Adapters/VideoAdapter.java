package com.mdo.quickquoter.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mdo.quickquoter.Models.VideoItem;
import com.mdo.quickquoter.R;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.LaborHolder> {

    Context context;
    List<VideoItem> videoItems;

    public VideoAdapter(Context context, List<VideoItem> videoItem) {
        this.context = context;
        this.videoItems = videoItem;
    }

    @Override
    public void onBindViewHolder(@NonNull LaborHolder holder, final int position) {
        VideoItem video = videoItems.get(position);
        holder.getVideoView().setVideoURI(video.getUri());
        holder.getVideoView().start();
        MediaController mediaController = new MediaController(context);
        holder.getVideoView().setMediaController(mediaController);
        mediaController.setAnchorView(holder.getVideoView());
    }

    @NonNull
    @Override
    public LaborHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_item, parent, false);

        return new LaborHolder(view);
    }

    @Override
    public int getItemCount() {
        return videoItems.size();
    }

    public static class LaborHolder extends RecyclerView.ViewHolder {
        private final VideoView videoView;

        public LaborHolder(View view) {
            super(view);
            this.videoView = view.findViewById(R.id.videoView);
        }

        public VideoView getVideoView() { return videoView; }
    }
}
