package com.fundoonotes.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.fundoonotes.model.Note;
import com.fundoonotes.model.User;

import jakarta.persistence.criteria.Predicate;


public class NoteSpecifications {

    private NoteSpecifications() {} 

    public static Specification<Note> search(User owner, String titleText, Note.NoteState state, String tagName) {

        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            // Owner condition is ALWAYS required.
            predicates.add(
                    criteriaBuilder.equal(root.get("owner"), owner)
            ); 

            // Title filter
            if(titleText != null && !titleText.isBlank()) {

                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("title")), "%" + titleText.toLowerCase() + "%"
                        )
                );
            }

            // State filter
            if(state != null) {

                predicates.add(
                        criteriaBuilder.equal(root.get("state"), state)
                ); 
            }

            // Tag filter
            if(tagName != null && !tagName.isBlank()) {

                predicates.add(
                        criteriaBuilder.equal(root.join("tags").get("name"), tagName)
                );
            }

            return criteriaBuilder.and(
                    predicates.toArray(new Predicate[0]) 
            );
        };
    }
}