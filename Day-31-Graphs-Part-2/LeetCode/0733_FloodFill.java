/*
 * Practice: 733 - Flood Fill
 *
 * Pattern:
 * DFS + Grid Traversal
 *
 * Description:
 * Change the color of a connected region starting from a given
 * pixel. Only cells connected in four directions with the same
 * original color are changed.
 *
 * Approach:
 * - Store the original color of the starting pixel.
 * - If the original color and new color are the same, return the image.
 * - Start DFS from the given pixel.
 * - Change the current pixel to the new color.
 * - Recursively visit the four neighboring pixels.
 * - Only continue when the neighbor has the original color.
 *
 * Time Complexity:
 * O(m × n)
 *
 * Space Complexity:
 * O(m × n)
 *
 * where:
 * m = number of rows
 * n = number of columns
 */

class Solution {
    public int[][] floodFill(
            int[][] image,
            int sr,
            int sc,
            int color) {

        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(
            int[][] image,
            int row,
            int col,
            int originalColor,
            int color) {

        int m = image.length;
        int n = image[0].length;

        if (row < 0 || row >= m ||
            col < 0 || col >= n ||
            image[row][col] != originalColor) {

            return;
        }

        image[row][col] = color;

        dfs(image, row - 1, col, originalColor, color);
        dfs(image, row + 1, col, originalColor, color);
        dfs(image, row, col - 1, originalColor, color);
        dfs(image, row, col + 1, originalColor, color);
    }
}