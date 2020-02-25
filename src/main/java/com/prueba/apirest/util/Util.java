package com.prueba.apirest.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Util {
	
	public static String wsUrl;
	
	@Value("${websocket.url}")
	public void setParamSocket(String url) {
		wsUrl = url;
	}
	
	public static void ejecutarWS() {
		
		HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(wsUrl);
        
        List<NameValuePair> arguments = new ArrayList<>(1);
        arguments.add(new BasicNameValuePair("channel", "reload-atenciones"));

        try {
            post.setEntity(new UrlEncodedFormEntity(arguments));
            HttpResponse response = client.execute(post);

            // Print out the response message
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
	
	}
	
}
