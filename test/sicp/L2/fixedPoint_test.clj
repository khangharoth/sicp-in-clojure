(ns sicp.L2.fixedPoint-test
  (:require [clojure.test :refer :all]
            [sicp.util :refer :all]
            [sicp.L2.fixedPoint :refer :all]))


(deftest fixedPoint-test
  (is true (close? 1.0 125.0 (fixedPoint (fn [x] (+ x (/ 1 x))) 10.0) ))
  )
