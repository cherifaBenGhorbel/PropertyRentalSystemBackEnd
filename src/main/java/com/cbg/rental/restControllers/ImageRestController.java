package com.cbg.rental.restControllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cbg.rental.entities.Image;
import com.cbg.rental.service.ImageService;

@RestController
@RequestMapping("/api/image")
@CrossOrigin(origins = ("*"))
public class ImageRestController {

	@Autowired
	ImageService imageService ;

	@RequestMapping(value = "/upload" , method = RequestMethod.POST)
	public Image uploadImage(@RequestParam("image")MultipartFile file) throws IOException {
		return imageService.uplaodImage(file);
	}
	@RequestMapping(value = "/get/info/{id}" , method = RequestMethod.GET)
	public Image getImageDetails(@PathVariable("id") Long id) throws IOException {
		return imageService.getImageDetails(id) ;
	}
	@RequestMapping(value = "/load/{id}" , method = RequestMethod.GET)
	public ResponseEntity<byte[]> getImage(@PathVariable("id") Long id) throws IOException
	{
		return imageService.getImage(id);
	}


	@RequestMapping(value = "/delete/{id}" , method = RequestMethod.DELETE)
	public void deleteImage(@PathVariable("id") Long id){
		imageService.deleteImage(id);
	}
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public Image UpdateImage(@RequestParam("image")MultipartFile file) throws IOException {
		return imageService.uplaodImage(file);
	}
	
	@PostMapping(value = "/uplaodImageHous/{idHous}" )
	 public Image uploadMultiImages(@RequestParam("image")MultipartFile file,
	 @PathVariable("idHous") Long idHous)
	throws IOException {
	 return imageService.uplaodImageHouse(file,idHous);
	 }
	@RequestMapping(value = "/getImagesHous/{idHous}" ,
	 method = RequestMethod.GET)
	 public List<Image> getImagesProd(@PathVariable("idHous") Long idHous)
	throws IOException {
	 return imageService.getImagesByHouse(idHous);
	 }

}
