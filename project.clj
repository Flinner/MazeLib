(defproject maze "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/Flinner/MazeLib/"
  :license {:name "AGPL-3.0-only"
            :url "https://www.gnu.org/licenses/agpl-3.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot maze.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
