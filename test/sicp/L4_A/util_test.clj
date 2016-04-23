(ns sicp.L4-A.util-test
  (:require [clojure.test :refer :all]
            [sicp.L4_A.util :refer :all]))

(deftest atomic?-test
  (is (= false  (atomic? '(+ x x))))
  (is (= true  (atomic? 'x)))
  (is (= true  (atomic? '+))))
