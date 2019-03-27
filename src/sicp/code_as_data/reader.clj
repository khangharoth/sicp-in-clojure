(ns sicp.code-as-data.reader)

(defn atomic? [exp]
  (not (or (list? exp) (seq? exp))))

(defn assq [var dict]
  (cond (= '() dict) nil
        (= (first (first dict)) var) (first dict)
        :else (assq var (rest dict))))

(defn lookup [var dictionary]
  (let [v (assq var dictionary)]
    (if (nil? v) var
                 (nth v 1))))

(defn evaluate [form dictionary]
  (if (atomic? form) (lookup form dictionary)

                     (apply (eval (lookup (first form) dictionary))
                            (map (fn [v] (lookup v dictionary)) (rest form))
                            )))


(println (evaluate '(+ x y 2) '((y 1) (x 3))))
