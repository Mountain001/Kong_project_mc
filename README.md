# CS5296 Cloud Computing:Theo & Prac Project -MACheng
## 构建docker image
1. 进入ServiceA目录
2. 打开控制台，执行 docker build -t service-mc ./
3. 保存镜像 执行 docker save -o ./service-mc service-mc:lastest
4. 载入镜像 Docker load -i 镜像名称
