package com.popularity.media.provider;

import java.util.List;

import com.popularity.media.feedback.MediaUserFeedBackMetrics;
import com.popularity.media.metadata.MediaMetadataMetrics;
import com.popularity.spi.MediaPopularity;
import com.popularity.user.metrcis.UserPopularityMetrics;

public class FlickerPhotoPopularity implements MediaPopularity{

	@Override
	public String getProviderName() {
		
		return "Photo";
	}

	@Override
	public MediaMetadataMetrics getmetadata(String id_media) {
				return null;
	}

	@Override
	public MediaUserFeedBackMetrics getUserFeeBack(String id_media) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPopularityMetrics getAuthorPopularity(String id_media) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public MediaMetadataMetrics  defineMediaPopularityMetadataMetrics(List <Attribute>  metadata_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MediaUserFeedBackMetrics  defineMediaPopularityUserFeedBackMetrics(
			List <Attribute> feedBack_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}

}
