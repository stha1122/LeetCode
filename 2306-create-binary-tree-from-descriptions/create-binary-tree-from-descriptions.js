/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[][]} descriptions
 * @return {TreeNode}
 */
var createBinaryTree = function (descriptions) {
    let map = new Map();
    let count = new Set();

    for (let i = 0; i < descriptions.length; i++) {
        let [val, child, isLeft] = descriptions[i];
        if (!map.has(child)) {
            map.set(child, new TreeNode(child));
        }

        count.delete(child);

        if (!map.has(val)) {
            map.set(val, new TreeNode(val));
            count.add(val);
        }

        if (isLeft)
            map.get(val).left = map.get(child);
        else
            map.get(val).right = map.get(child);
    }
    let root = [...count][0];
    return map.get(root);
};