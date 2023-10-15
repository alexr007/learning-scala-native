package app

import cats.effect.IO
import cats.effect.IOApp
import fs2._

object Main extends IOApp.Simple {

  override def run: IO[Unit] =
    Stream
      .unfold(0) {
        case x if x < 10 => Some((x, x + 1))
        case 10          => None
      }
      .evalTap(x => IO.println(x))
      .compile
      .drain

}
