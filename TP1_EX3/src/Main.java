

public class Main {
        public static void main(String[] args) {
                // Test CustomArrayList

                CustomArrayList customList = new CustomArrayList();

                customList.add(1);
                customList.add(2);
                customList.add(3);

                System.out.println("Elements in the list:");
                for (int i = 0; i < customList.size(); i++) {
                        System.out.println(customList.get(i));
                }

                customList.add(1, 5);

                System.out.println("\nElements after adding at index 1:");
                for (int i = 0; i < customList.size(); i++) {
                        System.out.println(customList.get(i));
                }

                int searchElement = 3;
                System.out.println("\nIs " + searchElement + " in the list? " + customList.isIn(searchElement));

                int findElement = 5;
                System.out.println("Index of " + findElement + ": " + customList.find(findElement));

                int removeElement = 2;
                customList.remove(removeElement);

                System.out.println("\nElements after removing " + removeElement + ":");
                for (int i = 0; i < customList.size(); i++) {
                        System.out.println(customList.get(i));
                }
        }
}
