(ns sicp.L0.evaluation-oder-test
  (:require [clojure.test :refer :all]
            [sicp.L0.evaluation-oder :refer :all]))

(deftest order-Test
  (is (= 0 (order-find  0 (p))))
  )
