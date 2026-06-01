## GitHub Copilot Chat

- Extension: 0.49.0 (prod)
- VS Code: 1.121.0 (f6cfa2ea2403534de03f069bdf160d06451ed282)
- OS: win32 10.0.22631 x64
- GitHub Account: ummaesalma5-afk

## Network

User Settings:
```json
  "http.systemCertificatesNode": true,
  "github.copilot.advanced.debug.useElectronFetcher": true,
  "github.copilot.advanced.debug.useNodeFetcher": false,
  "github.copilot.advanced.debug.useNodeFetchFetcher": true
```

Connecting to https://api.github.com:
- DNS ipv4 Lookup: Error (79 ms): getaddrinfo ENOTFOUND api.github.com
- DNS ipv6 Lookup: Error (40 ms): getaddrinfo ENOTFOUND api.github.com
- Proxy URL: None (1 ms)
- Electron fetch (configured): Error (289 ms): Error: net::ERR_NAME_NOT_RESOLVED
	at SimpleURLLoaderWrapper.<anonymous> (node:electron/js2c/utility_init:2:10684)
	at SimpleURLLoaderWrapper.emit (node:events:519:28)
  {"is_request_error":true,"network_process_crashed":false}
- Node.js https: Error (19 ms): Error: getaddrinfo ENOTFOUND api.github.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)
- Node.js fetch: Error (26 ms): TypeError: fetch failed
	at node:internal/deps/undici/undici:14902:13
	at process.processTicksAndRejections (node:internal/process/task_queues:103:5)
	at async n._fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:5278)
	at async n.fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:4590)
	at async u (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5516:186)
	at async Sg._executeContributedCommand (file:///c:/Users/shaik/AppData/Local/Programs/Microsoft%20VS%20Code/f6cfa2ea24/resources/app/out/vs/workbench/api/node/extensionHostProcess.js:502:48807)
  Error: getaddrinfo ENOTFOUND api.github.com
  	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)

Connecting to https://api.githubcopilot.com/_ping:
- DNS ipv4 Lookup: Error (13 ms): getaddrinfo ENOTFOUND api.githubcopilot.com
- DNS ipv6 Lookup: Error (19 ms): getaddrinfo ENOTFOUND api.githubcopilot.com
- Proxy URL: None (10 ms)
- Electron fetch (configured): Error (374 ms): Error: net::ERR_NAME_NOT_RESOLVED
	at SimpleURLLoaderWrapper.<anonymous> (node:electron/js2c/utility_init:2:10684)
	at SimpleURLLoaderWrapper.emit (node:events:519:28)
  {"is_request_error":true,"network_process_crashed":false}
- Node.js https: Error (13 ms): Error: getaddrinfo ENOTFOUND api.githubcopilot.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)
- Node.js fetch: Error (23 ms): TypeError: fetch failed
	at node:internal/deps/undici/undici:14902:13
	at process.processTicksAndRejections (node:internal/process/task_queues:103:5)
	at async n._fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:5278)
	at async n.fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:4590)
	at async u (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5516:186)
	at async Sg._executeContributedCommand (file:///c:/Users/shaik/AppData/Local/Programs/Microsoft%20VS%20Code/f6cfa2ea24/resources/app/out/vs/workbench/api/node/extensionHostProcess.js:502:48807)
  Error: getaddrinfo ENOTFOUND api.githubcopilot.com
  	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)

Connecting to https://copilot-proxy.githubusercontent.com/_ping:
- DNS ipv4 Lookup: Error (8 ms): getaddrinfo ENOTFOUND copilot-proxy.githubusercontent.com
- DNS ipv6 Lookup: Error (5 ms): getaddrinfo ENOTFOUND copilot-proxy.githubusercontent.com
- Proxy URL: None (21 ms)
- Electron fetch (configured): Error (340 ms): Error: net::ERR_NAME_NOT_RESOLVED
	at SimpleURLLoaderWrapper.<anonymous> (node:electron/js2c/utility_init:2:10684)
	at SimpleURLLoaderWrapper.emit (node:events:519:28)
  {"is_request_error":true,"network_process_crashed":false}
- Node.js https: Error (12 ms): Error: getaddrinfo ENOTFOUND copilot-proxy.githubusercontent.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)
- Node.js fetch: Error (24 ms): TypeError: fetch failed
	at node:internal/deps/undici/undici:14902:13
	at process.processTicksAndRejections (node:internal/process/task_queues:103:5)
	at async n._fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:5278)
	at async n.fetch (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5484:4590)
	at async u (c:\Users\shaik\AppData\Local\Programs\Microsoft VS Code\f6cfa2ea24\resources\app\extensions\copilot\dist\extension.js:5516:186)
	at async Sg._executeContributedCommand (file:///c:/Users/shaik/AppData/Local/Programs/Microsoft%20VS%20Code/f6cfa2ea24/resources/app/out/vs/workbench/api/node/extensionHostProcess.js:502:48807)
  Error: getaddrinfo ENOTFOUND copilot-proxy.githubusercontent.com
  	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)

Connecting to https://mobile.events.data.microsoft.com: Error (294 ms): Error: net::ERR_NAME_NOT_RESOLVED
	at SimpleURLLoaderWrapper.<anonymous> (node:electron/js2c/utility_init:2:10684)
	at SimpleURLLoaderWrapper.emit (node:events:519:28)
  {"is_request_error":true,"network_process_crashed":false}
Connecting to https://dc.services.visualstudio.com: Error (281 ms): Error: net::ERR_NAME_NOT_RESOLVED
	at SimpleURLLoaderWrapper.<anonymous> (node:electron/js2c/utility_init:2:10684)
	at SimpleURLLoaderWrapper.emit (node:events:519:28)
  {"is_request_error":true,"network_process_crashed":false}
Connecting to https://copilot-telemetry.githubusercontent.com/_ping: Error (16 ms): Error: getaddrinfo ENOTFOUND copilot-telemetry.githubusercontent.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)
Connecting to https://copilot-telemetry.githubusercontent.com/_ping: Error (39 ms): Error: getaddrinfo ENOTFOUND copilot-telemetry.githubusercontent.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)
Connecting to https://default.exp-tas.com: Error (54 ms): Error: getaddrinfo ENOTFOUND default.exp-tas.com
	at GetAddrInfoReqWrap.onlookupall [as oncomplete] (node:dns:122:26)

Number of system certificates: 87

## Documentation

In corporate networks: [Troubleshooting firewall settings for GitHub Copilot](https://docs.github.com/en/copilot/troubleshooting-github-copilot/troubleshooting-firewall-settings-for-github-copilot).