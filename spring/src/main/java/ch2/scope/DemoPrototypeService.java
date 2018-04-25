package ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
