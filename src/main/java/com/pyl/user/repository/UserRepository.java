package com.pyl.user.repository;

import com.pyl.user.entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

    Predicate toPredicate(Root<User> root, CriteriaQuery query, CriteriaBuilder cb);

    static Specification<User> firstNameContains(String firstName) {
        return (user, cq, cb) -> cb.equal(user.get("first_name"), firstName);
    }

    static Specification<User> lastNameContains(String lastName) {
        return (user, cq, cb) -> cb.like(user.get("last_name"), "%" + lastName + "%");
    }

    static Specification<User> emailContains(String email) {
        return (user, cq, cb) -> cb.like(user.get("email"), "%" + email + "%");
    }

    static Specification<User> phoneContains(String phone) {
        return (user, cq, cb) -> cb.like(user.get("phone"), "%" + phone + "%");
    }
}
