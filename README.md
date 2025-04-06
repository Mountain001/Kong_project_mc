# CS5296 Cloud Computing:Theo & Prac Project -MACheng
## 构建docker image
1. 进入ServiceA目录
2. 打开控制台，执行 docker build -t service-mc ./
3. 保存镜像 执行 docker save -o ./service-mc service-mc:lastest
4. 载入镜像 Docker load -i 镜像名称

## EC2 安装docker命令 https://docs.docker.com/engine/install/ubuntu/
### 设置存储库
``` sudo apt-get update
sudo apt-get install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc

echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "${UBUNTU_CODENAME:-$VERSION_CODENAME}") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update
```
### 安装docker包

``` sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin```  
