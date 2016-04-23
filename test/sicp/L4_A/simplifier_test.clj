(ns sicp.L4-A.simplifier-test
  (:require [clojure.test :refer :all]
            [sicp.L4_A.simplifier :refer :all]))


(def poly '(dd (+ x y) x))
(def poly1 '(+ (dd x x) (dd y x)))


(deftest simplify-test
  (is (= '(+ 1 0) (simplify poly simplify-parts)))
  (is (= '(+ 1 0) (simplify poly1 simplify-parts)))
  )
