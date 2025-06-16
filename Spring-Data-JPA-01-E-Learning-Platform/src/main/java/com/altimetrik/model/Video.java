package com.altimetrik.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
//@Polymorphism(type = PolymorphismType.EXPLICIT)
//@PrimaryKeyJoinColumn(name = "video_id")
//@DiscriminatorValue("V")
public class Video extends Resource{
	
	  private Integer length;
}
