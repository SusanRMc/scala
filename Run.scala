object Run {
  implicit class IntTimes(x: Int) {
    def times [A] (f: => A): Unit = {
      def loop(current: Int): Unit =

        if (current > 0)
  }
