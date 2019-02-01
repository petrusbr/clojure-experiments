(ns clojure-experiments.core)

;; Destructuring
(def languages ["Clojure", "Lisp", "Javascript", "Java", "Pascal"])

(def clojure {:name "Clojure" :author "Rich Hickey" :paradigm "Functional"})

(defn destructuring-vectors [[l1 l2 & others]]
  (println (str "First language -> " l1))
  (println (str "Second language -> " l2))
  (println (str "Others languages -> " others)))

(defn destructuring-maps [{linguagem :name paradigma :paradigm}]
  (println "Linguagem " linguagem)
  (println "Paradigma " paradigma))

(defn destruct-maps-using-keys [{:keys [name paradigm] :as clj}]
  (println name)
  (println paradigm)
  (println clj))

(defn destructuring []
  (let [languages-vec ["Clojure", "Lisp", "Javascript", "Java", "Pascal"]
        language-map {:name "Clojure" :author "Rich Hickey" :paradigm "Functional"}]
        (destructuring-vectors languages-vec)
        (destructuring-maps language-map)
        (destruct-maps-using-keys language-map)))
      

(defn announce-treasure-location
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
