(ns sicp.L4_A.util)


(defn atomic? [exp]
  (not (or (list? exp) (seq? exp))))