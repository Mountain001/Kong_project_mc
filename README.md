# CS5296 Cloud Computing:Theo & Prac Project -MACheng
## 构建docker image
1. 进入ServiceA目录
2. 打开控制台，执行 docker build -t java-kong-service .
3. 保存镜像 执行 docker save -o java-kong-service.tar java-kong-service:lastest
4. 载入镜像 Docker load -i java-kong-service.tar

然后运行服务在两个不同端口 
```docker run -d -p 19001:19001 --name java-kong-service-1 java-kong-service --server.port=19001 ```
```docker run -d -p 19002:19002 --name java-kong-service-2 java-kong-service --server.port=19002 ```

另一台部署Kong Gateway, Konga, PostgreSQL  
上传docker-compose.yml, 在上传目录终端执行命令 ``` docker-compose up -d ``` 即可


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
