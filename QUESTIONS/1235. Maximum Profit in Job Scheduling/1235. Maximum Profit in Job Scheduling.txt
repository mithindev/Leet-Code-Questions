
class Solution:
    def find(self, i, job, startTime, n, dp):
        if i >= n:
            return 0
        if dp[i] != -1:
            return dp[i]

        index = startTime.index(job[i][1])

        pick = job[i][2] + self.find(index, job, startTime, n, dp)
        notpick = self.find(i + 1, job, startTime, n, dp)
        dp[i] = max(pick, notpick)
        return dp[i]

    def jobScheduling(self, startTime, endTime, profit):
        n = len(startTime)
        job = [[startTime[i], endTime[i], profit[i]] for i in range(n)]
        dp = [-1] * n

        job.sort(key=lambda x: x[1])
        startTime.sort()

        return self.find(0, job, startTime, n, dp)
