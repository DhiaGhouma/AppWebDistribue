package tn.esprit.ratingservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ratingservice.dto.RatingDTO;
import tn.esprit.ratingservice.model.Rating;
import tn.esprit.ratingservice.model.Skill;
import tn.esprit.ratingservice.service.RatingService;
import tn.esprit.ratingservice.repository.SkillRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ratings")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;
    private final SkillRepository skillRepository;

    @PostMapping
    public ResponseEntity<Rating> createRating(@Valid @RequestBody RatingDTO ratingRequest) {
        Rating rating = ratingService.rateSkill(ratingRequest);
        return new ResponseEntity<>(rating, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUser(@PathVariable Long userId) {
        List<Rating> ratings = ratingService.getRatingsByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/skill/{skillId}")
    public ResponseEntity<List<Rating>> getRatingsBySkill(@PathVariable Long skillId) {
        Optional<Skill> skill = skillRepository.findById(skillId);
        if (skill.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        List<Rating> ratings = ratingService.getRatingsBySkill(skill.get());
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/skill/{skillId}/average")
    public ResponseEntity<Double> getAverageRatingForSkill(@PathVariable Long skillId) {
        Double averageRating = ratingService.getAverageRatingForSkill(skillId);
        return ResponseEntity.ok(averageRating != null ? averageRating : 0.0);
    }

    @GetMapping("/skill/{skillId}/count")
    public ResponseEntity<Integer> getTotalRatingsForSkill(@PathVariable Long skillId) {
        Integer count = ratingService.getTotalRatingsForSkill(skillId);
        return ResponseEntity.ok(count != null ? count : 0);
    }
}