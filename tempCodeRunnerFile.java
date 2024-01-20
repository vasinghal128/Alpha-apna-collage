int i = num-4; i >= 0; i--) {
            if (i == 0) {
                System.out.println("*".repeat(num));
            } else {
                System.out.println("*".repeat(num/2-i+1) + " ".repeat(2 * i - 1) + "*".repeat(num/2-i+1));
            }
        }