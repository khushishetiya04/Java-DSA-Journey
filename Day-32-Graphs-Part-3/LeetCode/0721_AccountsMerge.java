/*
 * Practice: LeetCode 721 - Accounts Merge
 *
 * Pattern: Graph + DSU (Disjoint Set Union) + HashMap
 *
 * Description:
 * Given accounts where each account contains a name followed by email
 * addresses, merge accounts that share at least one common email.
 *
 * Approach:
 * 1. Give every account its own DSU parent.
 * 2. Map every email to the account index where it first appears.
 * 3. If an email appears in another account, union those two accounts.
 * 4. After all unions, group emails by their ultimate parent.
 * 5. Sort emails in each group.
 * 6. Add the account name followed by its merged emails.
 *
 * Time Complexity: O(E log E)
 * Space Complexity: O(E)
 *
 * E = total number of email addresses.
 */

class Solution {
    int[] parent;
    int[] size;

    public List<List<String>> accountsMerge(
            List<List<String>> accounts) {

        int n = accounts.size();
        parent = new int[n];
        size = new int[n];

        // Initialize DSU
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Email -> account index
        Map<String, Integer> emailToAccount =
                new HashMap<>();

        /*
         * Connect accounts having common emails.
         */
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);

                if (!emailToAccount.containsKey(email)) {
                    emailToAccount.put(email, i);

                } else {
                    union(
                        i,
                        emailToAccount.get(email)
                    );
                }
            }
        }

        /*
         * Group emails by their ultimate parent.
         */
        Map<Integer, List<String>> merged =
                new HashMap<>();

        for (String email : emailToAccount.keySet()) {
            int accountIndex =
                    emailToAccount.get(email);

            int root = find(accountIndex);

            merged
                .computeIfAbsent(
                    root,
                    k -> new ArrayList<>()
                )
                .add(email);
        }

        List<List<String>> result =
                new ArrayList<>();

        /*
         * Create final merged accounts.
         */
        for (Map.Entry<Integer, List<String>> entry
                : merged.entrySet()) {

            int root = entry.getKey();
            List<String> emails = entry.getValue();
            Collections.sort(emails);

            List<String> account =
                    new ArrayList<>();

            account.add(accounts.get(root).get(0));
            account.addAll(emails);
            result.add(account);
        }
        return result;
    }

    // Find with path compression
    private int find(int node) {
        if (parent[node] == node) {
            return node;
        }

        return parent[node] =
                find(parent[node]);
    }

    // Union by size
    private void union(int u, int v) {
        int parentU = find(u);
        int parentV = find(v);

        if (parentU == parentV) {
            return;
        }

        if (size[parentU] < size[parentV]) {
            parent[parentU] = parentV;
            size[parentV] += size[parentU];

        } else {
            parent[parentV] = parentU;
            size[parentU] += size[parentV];
        }
    }
}