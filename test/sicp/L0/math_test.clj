(ns sicp.L0.math-test
  (:require [clojure.test :refer :all]
            [sicp.L0.math :refer :all]))


(deftest abs-test
  (is (= 3 (abs (- 3))))
  (is (= 3 (abs 3)))
  (is (= 0 (abs 0)))
  )

(deftest sum-test
  (is (= 4 (sum  1 3)))
  (is (= 2 (sum (- 1) 3)))
  (is (= 0 (sum 0 0)))
  )

(deftest square-test
  (is (= 9 (square 3)))
  (is (= 16 (square (- 4) )))
  (is (= 0 (square 0 )))
  )

(deftest average-test
  (is (= 4 (average 3 5)))
  )

(deftest mean-square-test
  (is (= 17 (mean-square 3 5)))
  )
