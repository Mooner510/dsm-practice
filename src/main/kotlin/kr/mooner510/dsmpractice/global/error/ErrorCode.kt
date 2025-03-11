package kr.mooner510.dsmpractice.global.error

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val message: String,
    val status: HttpStatus,
) {
    USER_NOT_FOUND("사용자를 찾지 못했습니다.", HttpStatus.NOT_FOUND),
    LOGIN_FAILED("아이디 혹은 비밀번호가 틀렸습니다.", HttpStatus.BAD_REQUEST),
    EXPIRED_TOKEN("로그인이 만료되었습니다.", HttpStatus.FORBIDDEN),
    UNSUPPORTED_TOKEN("잘못된 토큰입니다.", HttpStatus.FORBIDDEN),
    INVALID_UUID("잘못된 UUID입니다.", HttpStatus.BAD_REQUEST)
}
