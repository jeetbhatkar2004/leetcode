"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        hashmap = {}
        def helper(node):
            if not node:
                return None
            if node in hashmap:
                return hashmap[node]
            hashmap[node] = Node(node.val)
            neighbor = node.neighbors
            for i in range(len(neighbor)):
                hashmap[node].neighbors.append(helper(neighbor[i]))
            return hashmap[node]
        return helper(node)
