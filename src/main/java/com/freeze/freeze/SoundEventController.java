package com.freeze.freeze;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sound")
public class SoundEventController {

    private final SoundEventWebSocketHandler webSocketHandler;

    public SoundEventController(SoundEventWebSocketHandler webSocketHandler) {
        this.webSocketHandler = webSocketHandler;
    }

    @PostMapping
    public ResponseEntity<String> receiveSound(@RequestBody SoundEvent soundEvent) {
        System.out.println("💬 FastAPI로부터 수신된 사운드 이벤트: " + soundEvent);

        // 앱에 실시간 전송
        webSocketHandler.broadcast(soundEvent);

        return ResponseEntity.ok("OK");
    }
}
