(ns sicp.L1.sqrtByNewtonMethod-test
  (:require [clojure.test :refer :all]
            [sicp.util :refer :all]
            [sicp.L1.sqrtByNewtonMethod :refer :all]))


(deftest sqrt-test
  (is (close? 0.01 5.0 (sqrt 25.0 )) ))
