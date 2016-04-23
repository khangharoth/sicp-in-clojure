(ns sicp.L0.math-test
  (:require [clojure.test :refer :all]
            [sicp.L0.math :refer :all]))


(deftest abs-test
  (is (= 3 (abs (- 3))))
  (is (= 3 (abs 3)))
  (is (= 0 (abs 0)))
  )
