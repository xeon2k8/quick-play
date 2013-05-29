/*
 * Copyright (C) 2013 yixia.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vov.vitamio.demo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class VideoViewDemo extends Activity {

	/**
	 * TODO: Set the path variable to a streaming video URL or a local media file
	 * path.
	 */
	
//	private String path = "rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov";  //ANDA BIEN
//	private String path = "rtsp://v4.cache1.c.youtube.com/CiILENy73wIaGQk4RDShYkdS1BMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp";
//	private String path = "rtsp://video3.americafree.tv/AFTVAdventureH264250.sdp";
//	private String path = "http://devimages.apple.com/iphone/samples/bipbop/gear4/prog_index.m3u8";  //ANDA BIEN
//	private String path = "rtsp://stream.zoovision.com/documentary/gwgg.3gp";
//	private String path = "rtsp://s3/phimbo/hanquoc/2012/12/Horse.Doctor/Horse.Doctor.E02.mp4";
//	private String path = "http://commonsware.com/misc/test2.3gp";  //ANDA BIE
//	private String path = "http://www.ted.com/talks/download/video/8584/talk/761";
//	private String path = "rtsp://v3.cache7.c.youtube.com/CiILENy73wIaGQlOCTh0GvUeYRMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp";
//	private String path = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8";  //ANDA BIEN
//	private String path = "http://artestras.vo.llnwd.net/o35/geo/arte7/ALL/arteprod/046550-019/A7_SGT_ENC_14_046550-019-A_PG_HQ_FR_main.m3u8";
//	private String path = "http://aj.lsops.net/live/aljazeer_en_high.sdp/playlist.m3u8";
	private String path = "http://www.modrails.com/videos/passenger_nginx.mov";  //ANDA BIEN
//	private String path = "http://3glivehntv.doplive.com.cn/video1/index_128k.m3u8";  //ANDA BIEN
	
	private VideoView mVideoView;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		if (!LibsChecker.checkVitamioLibs(this))
			return;
		setContentView(R.layout.videoview);
		mVideoView = (VideoView) findViewById(R.id.surface_view);

		if (path == "") {
			// Tell the user to provide a media file URL/path.
			Toast.makeText(VideoViewDemo.this, "Please edit VideoViewDemo Activity, and set path" + " variable to your media file URL/path", Toast.LENGTH_LONG).show();
			return;
		} else {

			/*
			 * Alternatively,for streaming media you can use
			 * mVideoView.setVideoURI(Uri.parse(URLstring));
			 */
			mVideoView.setVideoPath(path);
			mVideoView.setMediaController(new MediaController(this));
			mVideoView.requestFocus();

		}
	}
}
