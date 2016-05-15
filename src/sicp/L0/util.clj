(ns sicp.L0.util
  (:require [sicp.L0.math :refer :all]))

(defn close-enf?
  ([tolerance x y] (< (abs (- x y)) tolerance))
  ([ x y] (< (abs (- x y)) 0.01)) )

