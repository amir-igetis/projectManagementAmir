// package com.amirul.projectManageAmir.controller;

// @RestController
// @RequestMapping("/api/chats")
// public class ChatController {
//
// @Autowired
// private ChatService chatService;
//
// @PostMapping("/create")
// public ResponseEntity<Chat> createChat(@RequestBody CreateChat chat) throws
// ProjectException {
// Chat createChat = chatService.createChat(chat.getProjectId(),
// chat.getUserIds());
// return ResponseEntity.ok(createChat);
// }
//
// @GetMapping("/project/{projectId}")
// public ResponseEntity<List<Chat>> getChatsByProjectId(@PathVariable Long
// projectId) throws ChatException {
// List<Chat> list = chatService.getChatsByProjectId(projectId);
// return ResponseEntity.ok(list);
// }
//
// @PostMapping("/{chatId}/addUsers")
// public ResponseEntity<Chat> addUsersToChat(@PathVariable Long chatId,
// @RequestParam List<Long> userIds) throws ChatException {
// Chat addedUsersToChat = chatService.addUsersToChat(chatId, userIds);
// return ResponseEntity.ok(addedUsersToChat);
// }
//
//// @GetMapping("/search")
//// public ResponseEntity<List<Chat>> searchChatsByName(@RequestParam String
// name) throws ChatException {
//// List<Chat> chats = chatService.searchChatsByName(name);
//// return ResponseEntity.ok(chats);
//// }
//
// // Other endpoints as needed
// }
