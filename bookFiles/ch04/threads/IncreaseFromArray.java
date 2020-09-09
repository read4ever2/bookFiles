package ch04.threads;

import ch04.queues.QueueInterface;

public class IncreaseFromArray implements Runnable {
  private final SyncCounter c;
  private final QueueInterface<Integer> q;

  public IncreaseFromArray(SyncCounter c, QueueInterface<Integer> q) {
    this.c = c;
    this.q = q;
  }

  public void run() {
    int hold;
    while (!q.isEmpty()) {
      hold = q.dequeue();
      for (int i = 1; i <= hold; i++)
        c.increment();
    }
  }
}