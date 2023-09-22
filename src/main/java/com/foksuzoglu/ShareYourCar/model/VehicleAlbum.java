package com.foksuzoglu.ShareYourCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vehicle_albums")
public class VehicleAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private String albumName;
    private String albumDescription;
    private String sharingSettings;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<AlbumImage> images;

}