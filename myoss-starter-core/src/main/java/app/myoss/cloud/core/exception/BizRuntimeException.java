/*
 * Copyright 2018-2018 https://github.com/myoss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package app.myoss.cloud.core.exception;

import lombok.Getter;

/**
 * 业务运行时异常
 *
 * @author Jerry.Chen
 * @since 2018年5月2日 上午1:13:57
 */
public class BizRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 7634892282599474024L;
    @SuppressWarnings("checkstyle:MutableException")
    @Getter
    private String            messageCode;

    /**
     * 业务运行时异常
     */
    public BizRuntimeException() {
        super();
    }

    /**
     * 业务运行时异常
     *
     * @param message 错误信息
     */
    public BizRuntimeException(String message) {
        super(message);
    }

    /**
     * 业务运行时异常
     *
     * @param cause 异常信息
     */
    public BizRuntimeException(Throwable cause) {
        super(cause);
    }

    /**
     * 业务运行时异常
     *
     * @param message 错误信息
     * @param cause 异常信息
     */
    public BizRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 业务运行时异常
     *
     * @param messageCode 错误代码
     * @param message 错误信息
     * @param cause 异常信息
     */
    public BizRuntimeException(String messageCode, String message, Throwable cause) {
        super(message, cause);
        this.messageCode = messageCode;
    }
}
