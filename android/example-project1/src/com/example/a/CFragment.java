package com.example.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Element;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class CFragment extends Fragment {
	
	private String responseString;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.cfragment, container, false);
        VideoView vw = (VideoView) view.findViewById(R.id.videoCFragment);
        
        String video_id = "8BoTQz9fxi0";
        String gdata = "http://gdata.youtube.com/feeds/api/videos/";
//        String youtube_response = Util.getUrlResponse(gdata+video_id); // just a simple HTTP GET
        HttpResponse response = null;
        
        HttpClient httpclient = new DefaultHttpClient();
        try {
        				response = httpclient.execute(new HttpGet(gdata + video_id));
                } catch (ClientProtocolException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
			response.getEntity().writeTo(out);
	        out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        responseString = out.toString();
        String[] asd = responseString.split("rtsp:");
        String[] asddasd = asd[1].split(".3gp");
        String rtsp_link = "rtsp:"+ asddasd[0] + ".3gp";
        
        vw.setVideoURI(Uri.parse(rtsp_link));
        vw.setMediaController(new MediaController(getActivity()));
        vw.requestFocus();
        vw.start();
        
        

    return view;
    }
    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.add("frag");
    }
    

}
