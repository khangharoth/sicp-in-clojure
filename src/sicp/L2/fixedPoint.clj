(ns sicp.L2.fixedPoint
  (:require
    [sicp.L0.math :refer :all]
    [sicp.L0.util :refer :all]))


(defn fixedPoint [fn x]
  (defn iter [oldValue newValue]
    (if (close-enf? 0.01 oldValue newValue) newValue
                                       (iter newValue (fn newValue))
                                       )
    )
  (iter x (fn x))
  )
