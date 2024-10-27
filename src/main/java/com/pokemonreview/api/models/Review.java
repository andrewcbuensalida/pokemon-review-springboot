package com.pokemonreview.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String content;
  private int stars;

  // Many reviews can belong to one Pokemon. FetchType.LAZY means that the
  // associated Pokemon entity will not be loaded from the database until it is
  // accessed for the first time.
  @ManyToOne(fetch = FetchType.LAZY) 
  @JoinColumn(name = "pokemon_id") // This is the foreign key
  private Pokemon pokemon;

}
