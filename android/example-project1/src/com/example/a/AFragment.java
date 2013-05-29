package com.example.a;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class AFragment extends Fragment {
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.afragment, container, false);
        VideoView vw = (VideoView) view.findViewById(R.id.videoView);
//    	String path = "rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov";  //ANDA
//    	String path = "rtsp://v4.cache1.c.youtube.com/CiILENy73wIaGQk4RDShYkdS1BMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp";
//    	String path = "rtsp://video3.americafree.tv/AFTVAdventureH264250.sdp";
//    	String path = "http://devimages.apple.com/iphone/samples/bipbop/gear4/prog_index.m3u8";  //ANDA
//    	String path = "rtsp://stream.zoovision.com/documentary/gwgg.3gp";
//    	String path = "rtsp://s3/phimbo/hanquoc/2012/12/Horse.Doctor/Horse.Doctor.E02.mp4";
//    	String path = "http://commonsware.com/misc/test2.3gp";   //ANDA
//    	String path = "http://www.ted.com/talks/download/video/8584/talk/761";
//    	String path = "rtsp://v3.cache7.c.youtube.com/CiILENy73wIaGQlOCTh0GvUeYRMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp";
//    	String path = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8";  //ANDA
//    	String path = "http://artestras.vo.llnwd.net/o35/geo/arte7/ALL/arteprod/046550-019/A7_SGT_ENC_14_046550-019-A_PG_HQ_FR_main.m3u8";
//    	String path = "http://aj.lsops.net/live/aljazeer_en_high.sdp/playlist.m3u8";
    	String path = "http://www.modrails.com/videos/passenger_nginx.mov";
//    	String path = "http://3glivehntv.doplive.com.cn/video1/index_128k.m3u8"; //ANDA
        
        vw.setVideoURI(Uri.parse(path));
        vw.setOnPreparedListener(new OnPreparedListener() {
			@Override
			public void onPrepared(MediaPlayer mp) {
				// TODO Auto-generated method stub
				
			}
		});
        vw.setMediaController(new MediaController(getActivity()));
        vw.requestFocus();
        vw.start();
        return view;
    }
    
//    private void geturlYoutube() {
//    	String urlYoutube = "<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:media='http://search.yahoo.com/mrss/' xmlns:gd='http://schemas.google.com/g/2005' xmlns:yt='http://gdata.youtube.com/schemas/2007'><id>http://gdata.youtube.com/feeds/mobile/videos/3lxzuM5hAG8</id><published>2012-07-02T02:49:18.000Z</published><updated>2013-05-28T01:51:32.000Z</updated><category scheme='http://schemas.google.com/g/2005#kind' term='http://gdata.youtube.com/schemas/2007#video'/><title type='text'>Rumbita pa'l enganche - Juan Román Riquelme</title><content type='text'>Puse imágenes a este tema que pasaron en el programa de radio El Ultimo Diez. La canción se llama "Rumbita pa'l enganche" y fué realizada por Richsfaith Stonne (@rstonne)</content><link rel='alternate' type='text/html' href='http://www.youtube.com/watch?v=3lxzuM5hAG8&amp;feature=youtube_gdata'/><link rel='http://gdata.youtube.com/schemas/2007#video.responses' type='application/atom+xml' href='http://gdata.youtube.com/feeds/mobile/videos/3lxzuM5hAG8/responses'/><link rel='http://gdata.youtube.com/schemas/2007#video.related' type='application/atom+xml' href='http://gdata.youtube.com/feeds/mobile/videos/3lxzuM5hAG8/related'/><link rel='http://gdata.youtube.com/schemas/2007#mobile' type='text/html' href='http://m.youtube.com/details?v=3lxzuM5hAG8'/><link rel='self' type='application/atom+xml' href='http://gdata.youtube.com/feeds/mobile/videos/3lxzuM5hAG8'/><author><name>Gonzalo Peralta</name><uri>http://gdata.youtube.com/feeds/mobile/users/gonzaaa911</uri></author><gd:comments><gd:feedLink rel='http://gdata.youtube.com/schemas/2007#comments' href='http://gdata.youtube.com/feeds/mobile/videos/3lxzuM5hAG8/comments' countHint='95'/></gd:comments><media:group><media:category label='Motor' scheme='http://gdata.youtube.com/schemas/2007/categories.cat'>Autos</media:category><media:content url='rtsp://v6.cache3.c.youtube.com/CiILENy73wIaGQlvAGHOuHNc3hMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp' type='video/3gpp' medium='video' isDefault='true' expression='full' duration='234' yt:format='1'/><media:content url='rtsp://v6.cache3.c.youtube.com/CiILENy73wIaGQlvAGHOuHNc3hMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp' type='video/3gpp' medium='video' expression='full' duration='234' yt:format='6'/><media:description type='plain'>Puse imágenes a este tema que pasaron en el programa de radio El Ultimo Diez. La canción se llama "Rumbita pa'l enganche" y fué realizada por Richsfaith Stonne (@rstonne)</media:description><media:keywords/><media:player url='http://www.youtube.com/watch?v=3lxzuM5hAG8&amp;feature=youtube_gdata_player'/><media:thumbnail url='http://i.ytimg.com/vi/3lxzuM5hAG8/0.jpg' height='360' width='480' time='00:01:57'/><media:thumbnail url='http://i.ytimg.com/vi/3lxzuM5hAG8/1.jpg' height='90' width='120' time='00:00:58.500'/><media:thumbnail url='http://i.ytimg.com/vi/3lxzuM5hAG8/2.jpg' height='90' width='120' time='00:01:57'/><media:thumbnail url='http://i.ytimg.com/vi/3lxzuM5hAG8/3.jpg' height='90' width='120' time='00:02:55.500'/><media:title type='plain'>Rumbita pa'l enganche - Juan Román Riquelme</media:title><yt:duration seconds='234'/></media:group><gd:rating average='4.928994' max='5' min='1' numRaters='507' rel='http://schemas.google.com/g/2005#overall'/><yt:statistics favoriteCount='0' viewCount='119504'/></entry>"
//    		try {
//    			String gdy = "http://gdata.youtube.com/feeds/api/videos/";
//    			DocumentBuilder documentBuilder = DocumentBuilderFactory
//    					.newInstance().newDocumentBuilder();
//    			String id = extractYoutubeId(urlYoutube);
//    			URL url = new URL(gdy + id);
//    			HttpURLConnection connection = (HttpURLConnection) url
//    					.openConnection();
//    			Document doc = documentBuilder.parse(connection.getInputStream());
//    			// Element el = doc.getDocumentElement();
//    			// NodeList list =
//    			// el.getElementsByTagName("media:content");///media:content
//    			String cursor = urlYoutube;
//    			// for (int i = 0; i < list.getLength(); i++)
//    			// {
//    			// Node node = list.item(i);
//    			// if (node != null)
//    			// {
//    			// NamedNodeMap nodeMap = node.getAttributes();
//    			// HashMap<String, String> maps = new HashMap<String, String>();
//    			// for (int j = 0; j < nodeMap.getLength(); j++)
//    			// {
//    			// Attr att = (Attr) nodeMap.item(j);
//    			// maps.put(att.getName(), att.getValue());
//    			// }
//    			// if (maps.containsKey("yt:format"))
//    			// {
//    			// String f = maps.get("yt:format");
//    			// if (maps.containsKey("url"))
//    			// {
//    			// cursor = maps.get("url");
//    			// }
//    			// if (f.equals("1"))
//    			// return cursor;
//    			// }
//    			// }
//    			// }
//    			return cursor;
//    		} catch (Exception ex) {
//    			Log.e("Get Url Video RTSP Exception======>>", ex.toString());
//    		}
//    
//    }
    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.add("frag");
    }
 
}
