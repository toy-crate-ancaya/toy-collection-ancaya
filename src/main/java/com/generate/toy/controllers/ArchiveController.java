package com.generate.toy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generate.toy.repositories.ToyRepository;
import com.generate.toy.utils.MakeUploadAndDownloadArchive;



@RestController
@RequestMapping("file")
public class ArchiveController {
	  @Autowired
	    private MakeUploadAndDownloadArchive uploadService;

	    @Autowired
	    private ToyRepository toyRepository;

	    @GetMapping("/read/{archiveName}")
	    public ResponseEntity<Resource> downloadToyArchive(@PathVariable String archiveName) {
	        return uploadService.downloadArchive(archiveName, toyRepository);
	    }
}
