package kim.springevent.sync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
@Order(101)
public class Demo0Listener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        log.debug("--->{}<-{}", Thread.currentThread().getId(), this.getClass());
        log.debug("--->{}, Demo0Listener receive the message:{}", new Date(), event.getMessage());
    }
}
