"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    hashmap = {}
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return None
        if node in self.hashmap:
            return self.hashmap[node]
        self.hashmap[node] = Node(node.val)
        neighbor = node.neighbors
        for i in range(len(neighbor)):
            curr = neighbor[i]
            self.hashmap[node].neighbors.append(self.cloneGraph(curr))
        return self.hashmap[node]

        