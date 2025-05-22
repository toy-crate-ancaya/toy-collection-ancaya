package com.generate.toy.projections;

import org.springframework.web.multipart.MultipartFile;

public interface ToyProjection {
    String getToyName();
    String getToyObjective();
    String getToyCondition();
    String getArchiveName();
    Long getToyPrice();
    Long getToyLikes();
    Long getToyViews();
    Long getToyPopularity();
   
}
