(ns sicp.L1.ackermann-test
  (:require [clojure.test :refer :all]
            [sicp.L1.ackermann :refer :all]))


(deftest abs-test
  (is (= 65536 (ackmer 3 3)))
  )
