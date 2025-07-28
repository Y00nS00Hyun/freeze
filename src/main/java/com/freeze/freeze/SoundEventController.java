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
        System.out.println("소리 이벤트 수신됨: " + soundEvent);

        // WebSocket 브로드캐스트
        webSocketHandler.broadcast(soundEvent);

        return ResponseEntity.ok("데이터 받음");
    }
}
