package backend.net.urlshortener.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "short_code", referencedColumnName = "shortCode")
    private Url url;
    @Column(nullable = false)
    private LocalDateTime timestamp;
    @Column(nullable = false)
    private String ipAddress;
    @Column(nullable = false)
    private String userAgent;
    @Column(nullable = false)
    private String deviceType;

}
