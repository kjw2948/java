package advancedjava.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;


/*
Synchronized : 무한대기 문제 --> Lock 인터페이스를 통해 해결 가능 but 공정성 문제 남아있음
공정성 : 스레드의 순차적인 락 획득을 보장하지 않기때문에 특정 스레드가 오래 기다릴 수 있음

 */
public interface Lock {
    void lock(); // 락을 획득한다. 스레드가 이미 락을 획득했다면, 락이 풀릴때까지 현재 스레드는 대기(WAITING)한다. 인터럽트에도 응답x

    void lockInterruptibly() throws InterruptedException; //락 획득 가능 but 인터럽트도 가능하게 함

    boolean tryLock(); // 락 획득 바로 시도 -> 성공하면 true, 실패하면 false

    boolean tryLock(long time, TimeUnit unit) throws InterruptedException; //일정시간 동안 락 획득 시도

    void unlock(); // 락을 해제

    Condition newCondition(); // 컨디션 객체를 생성하여 반환, 락과 결합되어 사용. 스레드가 특정 조건을 기다리거나 신호를 받을 수 있도록 한다.

}
