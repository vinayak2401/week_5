int pairs = 0;
        int modCount[] = new int[k];

        for (int i = 0; i < n; i++) {
            int modVal = ar[i] % k;
            int complement = (k - modVal) % k;
            pairs += modCount[complement];
            modCount[modVal]++;
        }

        System.out.println("The total pairs are: " + pairs);

        input.close();