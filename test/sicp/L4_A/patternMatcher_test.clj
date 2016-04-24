(ns sicp.L4-A.patternMatcher-test
  (:require [clojure.test :refer :all]
            [sicp.L4_A.util :refer :all]
            [sicp.L4_A.patternMatcher :refer :all]))

(def pat-1 '(+ (* (? x) (? y)) (? y)))
(def exp-1 '(+ (* 3 x) x))



(deftest evaluate-test
  (is (= 6  (evaluate '(+ x x) '((y x) (x 3)) ))))

(deftest match-test
  (is (= '(( y x ) (x 3))  (match  pat-1 exp-1 make-empty-dictionary))))
