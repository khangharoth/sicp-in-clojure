(ns sicp.util
  (:require [sicp.L0.math :refer :all]))

(defn close? [tolerance x y]
  (< (abs (- x y)) tolerance))
