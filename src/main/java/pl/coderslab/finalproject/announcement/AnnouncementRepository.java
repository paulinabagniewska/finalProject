package pl.coderslab.finalproject.announcement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository <Announcement, Long> {
}
