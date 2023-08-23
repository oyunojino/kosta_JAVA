package basic_0822;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage(String message) {
        }
    }

    void startChat(String chatId) {
//        # 이것이 자바다 (p.404)
//        참조 변수 선언이 되어있기 때문에 nickName 값을 변경할 수 없음
//        String nickName = null;
//        nickName = nickName + chatId;
        String nickName = chatId;
        Chat chat = new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "안녕하세요.";
                    String message = "[ " + nickName + " ]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }

}
