package techsupport;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Passing issue to next handler");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle issue — escalate manually");
        }
    }
}