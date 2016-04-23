(ns sicp.L1.change-test
  (:require [clojure.test :refer :all]
            [sicp.L1.change :refer :all]))


(deftest abs-test
  (is (= 292 (count-change 100)))
  )
